package com.example.controller;

import com.example.entity.Lecture;
import com.example.exceptions.ResourceNotFoundException;
import com.example.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/teachers")
public class LectureController {
    private final LectureService lectureService;

    @Autowired
    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Lecture>> findAllLectures() throws Exception {
        try {
            return lectureService.findAllLectures();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
