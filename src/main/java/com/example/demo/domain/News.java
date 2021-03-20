package com.example.demo.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class News implements Serializable {

    private int id;
    private String title;
    private String content;
    private String url;
    private String date;

    public News(int id, String title) {
        this.id = id;
        this.title = title;
        this.content = "test";
        this.url = "url";
        this.date = "2021-3-16";
    }

    public News(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }
}
