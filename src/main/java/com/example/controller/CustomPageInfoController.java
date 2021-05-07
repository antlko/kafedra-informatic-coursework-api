package com.example.controller;

import com.example.entity.CustomPageInfo;
import com.example.exceptions.ResourceNotFoundException;
import com.example.response.CustomPageInfoResponse;
import com.example.service.CustomPageInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@CrossOrigin
@RestController
public class CustomPageInfoController {

    private final CustomPageInfoService customPageInfoService;

    public CustomPageInfoController(CustomPageInfoService customPageInfoService) {
        this.customPageInfoService = customPageInfoService;
    }

    @PostMapping("/admin/custompage")
    public ResponseEntity<CustomPageInfo> saveCustomPage(@RequestBody CustomPageInfo customPageInfo) {
        return customPageInfoService.save(customPageInfo);
    }

    @DeleteMapping("/admin/custompage")
    public ResponseEntity<CustomPageInfo> deleteCustomPage(
            @RequestParam(name = "url") String url
    ) throws UnsupportedEncodingException, ResourceNotFoundException {
        URLDecoder.decode(url, StandardCharsets.UTF_8.toString());
        return customPageInfoService.delete(url);
    }

    @GetMapping("/admin/custompages")
    public ResponseEntity<List<CustomPageInfoResponse>> getAllCustomPages() {
        return customPageInfoService.findAll();
    }

    @GetMapping("/custompage")
    public ResponseEntity<CustomPageInfo> getCustomPage(
            @RequestParam(name = "url") String url
    ) throws ResourceNotFoundException, UnsupportedEncodingException {
        URLDecoder.decode(url, StandardCharsets.UTF_8.toString());
        return customPageInfoService.getByURL(url);
    }

}
