package com.example.demo.model;

public class Info {

    private String email;
    private String info;

    public Info(String email,
                String info) {
        this.email = email;
        this.info = info;
    }

    public Info() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
