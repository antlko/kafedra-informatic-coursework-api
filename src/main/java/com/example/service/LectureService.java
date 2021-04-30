package com.example.service;

import com.example.entity.Lecture;
import com.example.exceptions.ResourceNotFoundException;
import com.example.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService {
    private final LectureRepository lectureRepository;

    @Autowired
    public LectureService(LectureRepository lectureRepository) {
        this.lectureRepository = lectureRepository;
    }

    public ResponseEntity<List<Lecture>> findAllLectures() throws ResourceNotFoundException {
        List<Lecture> lectures = lectureRepository.findAll();
        if (lectures.isEmpty()) {
            throw new ResourceNotFoundException("You do not have any teachers");
        }
        return new ResponseEntity<List<Lecture>>(lectures, HttpStatus.OK);
    }
}
