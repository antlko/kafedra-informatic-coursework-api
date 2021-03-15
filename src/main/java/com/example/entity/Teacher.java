package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "status")
    private String status;

    @Column(name = "avatar_name")
    private String avatarName;

    @Column(name = "science_name")
    private String science;

    @Column(name = "scientific_work_name")
    private String scientificWork;

    @Column(name = "educational_work_name")
    private String educationalWork;

    @Column(name = "description")
    private String description;

    @Column(name = "state_activity")
    private String stateActivity;

    @Column(name = "awards")
    private String awards;

    @Column(name = "other_information")
    private String other;

    @Column(name = "patent")
    private String patent;

    @OneToMany(mappedBy = "teacher")
    private Set<Dissertation> dissertations;

    @OneToMany(mappedBy = "teacher")
    private Set<TeacherSubject> teacherSubjects;
}
