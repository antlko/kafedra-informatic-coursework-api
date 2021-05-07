package com.example.request;

import com.example.response.HeaderResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class HeaderArrayRequest {

    @JsonProperty("data")
    private List<HeaderResponse> data;

    public HeaderArrayRequest() {

    }

}
