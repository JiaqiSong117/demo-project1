package com.example.demo.domain;

import java.io.Serializable;

public class Users implements Serializable {
    private int id;
    private String username;
    private String password;
    private String location;

    public Users(){}

    public Users(int id,String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.location = "unknow";
    }

    public Users(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
