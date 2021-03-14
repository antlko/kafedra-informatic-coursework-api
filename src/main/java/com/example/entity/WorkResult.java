package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "work_results")
public class WorkResult {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "student_comment")
    private String studentComment;

    @Column(name = "year_finish_university")
    private Integer yearFinishUniversity;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "specialize")
    private String specialize;

    @Column(name = "work_company")
    private String workCompany;

    @Column(name = "work_position")
    private String workPosition;

    @Column(name = "programming_languages")
    private String technologies;

    @Column(name = "date_create")
    private Date dateCreate;
}
