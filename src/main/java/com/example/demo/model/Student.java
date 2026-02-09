package com.example.demo.model;

import java.util.List;

public class Student
        extends User {

    private List<String> courses;

    public Student(String id,
                   String username,
                   String email,
                   String role,
                   List<String> courses) {
        super(id, username, email, role);
        this.courses = courses;
    }

    public Student() {
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public Info getProfileInfo() {
        return new Info(getEmail(), String.join("", courses));
    }
}
