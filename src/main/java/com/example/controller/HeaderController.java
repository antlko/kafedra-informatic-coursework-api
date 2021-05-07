package com.example.controller;

import com.example.entity.Header;
import com.example.repository.HeaderRepository;
import com.example.request.HeaderArrayRequest;
import com.example.response.HeaderResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class HeaderController {

    private final HeaderRepository headerRepository;

    public HeaderController(HeaderRepository headerRepository) {
        this.headerRepository = headerRepository;
    }

    @GetMapping("/header")
    public ResponseEntity<List<HeaderResponse>> getHeader() {
        List<Header> headerRes = headerRepository.findAll();

        Map<Integer, HeaderResponse> headerMap = new HashMap<>();
        List<HeaderResponse> headersMain = new ArrayList<>();

        // Hardcoded TWO layers deep in header (in future need to change)
        for (Header h : headerRes) {
            if (h.getParent() == null) {
                headerMap.put(h.getIdHeader(), new HeaderResponse(h.getIdHeader(), h.getName(), h.getUrl(), new ArrayList<>()));
            }
        }

        for (Header h : headerRes) {
            if (h.getParent() != null) {
                HeaderResponse headerElement = headerMap.get(h.getParent());
                if (headerElement != null) {
                    headerElement.getSub().add(new HeaderResponse(h.getIdHeader(), h.getName(), h.getUrl(), new ArrayList<>()));
                }
            }
        }

        for (Map.Entry<Integer, HeaderResponse> entry : headerMap.entrySet()) {
            headersMain.add(entry.getValue());
        }

        return new ResponseEntity<>(headersMain, HttpStatus.OK);
    }

    @PostMapping(value = "/admin/header")
    public void saveHeader(HttpServletRequest request) throws IOException {
        headerRepository.deleteAll();
        // JSON parsing logically should be in controller method
        String body = IOUtils.toString(request.getReader());
        ObjectMapper mapper = new ObjectMapper();
        HeaderArrayRequest headerArray = mapper.readValue(body, HeaderArrayRequest.class);

        List<HeaderResponse> headers = headerArray.getData();
        for (HeaderResponse h : headers) {
            if (h.getSub().size() > 0) {
                for (HeaderResponse sub : h.getSub()) {
                    saveHeader(h, sub);
                }
            }
            saveHeader(null, h);
        }
    }

    private void saveHeader(HeaderResponse h, HeaderResponse sub) {
        Header header = new Header();
        header.setIdHeader(sub.getId());
        if (h != null) {
            header.setParent(Math.toIntExact(h.getId()));
        }
        header.setName(sub.getName());
        header.setUrl(sub.getUrl());
        headerRepository.save(header);
    }

}
