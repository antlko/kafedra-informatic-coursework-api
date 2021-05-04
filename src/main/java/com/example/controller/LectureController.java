package com.example.controller;

import com.example.entity.Lecture;
import com.example.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class LectureController {

    private final LectureService lectureService;

    @Autowired
    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping( "/lectures/findAll")
    public ResponseEntity<List<Lecture>> findAllLectures() throws Exception {
        try {
            return lectureService.findAllLectures();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @PostMapping("/admin/lectures")
    public ResponseEntity<Lecture> saveLecture(@RequestBody Lecture lecture) throws Exception {
        try {
            return lectureService.save(lecture);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
