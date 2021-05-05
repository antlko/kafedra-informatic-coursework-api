package com.example.service;

import com.example.entity.Teacher;
import com.example.exceptions.ResourceNotFoundException;
import com.example.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public ResponseEntity<List<Teacher>> findAllLectures() throws ResourceNotFoundException {
        List<Teacher> teachers = teacherRepository.findAll();
        if (teachers.isEmpty()) {
            throw new ResourceNotFoundException("You do not have any teachers");
        }
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }

    public ResponseEntity<Teacher> save(Teacher teacher) {
        Teacher savedTeacher = teacherRepository.save(teacher);
        return new ResponseEntity<>(savedTeacher, HttpStatus.OK);
    }

    public ResponseEntity<Teacher> findByID(Long id) throws ResourceNotFoundException {
        return new ResponseEntity<>(
                teacherRepository.findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Teacher not found!")),
                HttpStatus.OK
        );
    }

    public ResponseEntity<Teacher> delete(Long id) throws ResourceNotFoundException {
        Teacher teacher = teacherRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Teacher not found!"));

        teacherRepository.delete(teacher);
        return new ResponseEntity<>(teacher, HttpStatus.OK);
    }
}
