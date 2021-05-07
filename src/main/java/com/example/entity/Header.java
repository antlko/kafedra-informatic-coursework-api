package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "headers_objects")
@Data
@NoArgsConstructor
public class Header {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "id_header")
    private Integer idHeader;

    @Column(name = "name")
    private String name;

    @Column(name = "parent")
    private Integer parent;

    @Column(name = "url")
    private String url;

}
