package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue
    private Long id;

    @Lob
    private byte[] content;

    private String name;
}