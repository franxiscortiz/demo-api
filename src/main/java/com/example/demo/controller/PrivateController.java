package com.example.demo.controller;


import com.example.demo.model.Info;
import com.example.demo.model.Student;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PrivateController {

    @GetMapping("/private")
    public String privateEndpoint() {
        return "It's working...";
    }

    @GetMapping("/user")
    public Student userEndpoint() {
        return new Student(
                "1",
                "student123",
                "student@est.com",
                "student",
                List.of("course-1", "course-2")
        );
    }

    @GetMapping("/user/info")
    public Info getUserInfo() {
        User user = new Student(
                "1",
                "student123",
                "student@est.com",
                "student",
                List.of("course-1", "course-2")
        );
        return user.getProfileInfo();
    }

    @GetMapping("/student/courses")
    public List<String> getCourses() {
        Student student = new Student(
                "1",
                "student123",
                "student@est.com",
                "student",
                List.of("course-1", "course-2")
        );
        return student.getCourses();
    }
}
