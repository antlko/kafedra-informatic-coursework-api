package com.example.service;

import com.example.entity.CustomPageInfo;
import com.example.exceptions.ResourceNotFoundException;
import com.example.repository.CustomPagesInfoRepository;
import com.example.response.CustomPageInfoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomPageInfoService {

    private final CustomPagesInfoRepository customPagesInfoRepository;

    public CustomPageInfoService(CustomPagesInfoRepository customPagesInfoRepository) {
        this.customPagesInfoRepository = customPagesInfoRepository;
    }

    public ResponseEntity<CustomPageInfo> save(CustomPageInfo customPageInfo) {
        return new ResponseEntity<>(
                customPagesInfoRepository.save(customPageInfo),
                HttpStatus.OK
        );
    }

    public ResponseEntity<CustomPageInfo> getByURL(String url) throws ResourceNotFoundException {
        return new ResponseEntity<>(
                customPagesInfoRepository.getByUrl(url)
                        .orElseThrow(() -> new ResourceNotFoundException("custom page not found")),
                HttpStatus.OK
        );
    }

    public ResponseEntity<List<CustomPageInfoResponse>> findAll() {
        List<CustomPageInfo> cpi = customPagesInfoRepository.findAll();
        List<CustomPageInfoResponse> responseList = cpi
                .stream()
                .map(el -> new CustomPageInfoResponse(el.getId(), el.getUrl()))
                .collect(Collectors.toList());

        return new ResponseEntity<>(responseList, HttpStatus.OK);

    }
}
