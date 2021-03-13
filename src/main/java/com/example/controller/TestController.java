package com.example.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Data
    class Entity {
        private String name;
    }

    @GetMapping("/test")
    public Entity getJSONEntity() {
        Entity entity = new Entity();
        entity.setName("TestName");
        return entity;
    }

}
