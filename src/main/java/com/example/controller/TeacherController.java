package com.example.controller;

import com.example.entity.Teacher;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers/findAll")
    public ResponseEntity<List<Teacher>> findAllLectures() throws Exception {
        try {
            return teacherService.findAllLectures();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @PostMapping("/admin/teacher")
    public ResponseEntity<Teacher> saveLecture(@RequestBody Teacher teacher) throws Exception {
        try {
            return teacherService.save(teacher);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
