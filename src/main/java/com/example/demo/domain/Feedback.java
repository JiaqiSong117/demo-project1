package com.example.demo.domain;

public class Feedback {
    private String name;
    private String email;
    private String text;

    public Feedback(String name, String email, String text) {
        this.name = name;
        this.email = email;
        this.text = text;
    }

    public Feedback() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
