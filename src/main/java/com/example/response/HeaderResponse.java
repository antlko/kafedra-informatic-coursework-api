package com.example.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class HeaderResponse {

    private Integer id;

    private String name;

    private String url;

    private List<HeaderResponse> sub;

    public HeaderResponse() {

    }

}
