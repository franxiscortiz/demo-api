package com.example.demo.controller;

import com.example.demo.model.Info;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @GetMapping("/public")
    public Info publicEndpoint() {
        return new Info("Public", "Test");
    }
}
