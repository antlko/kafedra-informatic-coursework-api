package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "lectures")
@Data
@NoArgsConstructor
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "name_link")
    private String nameLink;

    @Column(name = "status")
    private String status;

    @Column(name = "avatar_bytes")
    private String avatarBytes;

    @Column(name = "email")
    private String email;

    @Column(name = "achivments")
    private String achivments;

    @Column(name = "kvalification_info ")
    private String kvalificationInfo;

    @Column(name = "kvalification_link")
    private String kvalificationLink;

    @Column(name = "science_publication")
    private String sciencePublication;

    @Column(name = "science_publication_link")
    private String sciencePublicationLink;

    @Column(name = "science_interest")
    private String scienceInterest;

    @Column(name = "discipline")
    private String discipline;
}
