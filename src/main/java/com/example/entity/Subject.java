package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "language")
    private String language;

    @Column(name = "grading")
    private String grading;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "subject")
    private Set<TeacherSubject> teacherSubjects;

    @OneToMany(mappedBy = "subject")
    private Set<CourseWork> courseWorks;

    @OneToMany(mappedBy = "subject")
    private Set<TrainingManual> trainingManuals;
}
