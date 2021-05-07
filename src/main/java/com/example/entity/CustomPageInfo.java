package com.example.entity;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "custom_pages_info")
@Data
@NoArgsConstructor
public class CustomPageInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "url")
    private String url;

    @Column(name = "info_json")
    @JsonSetter(value = "info_json")
    private String infoJson;

}
