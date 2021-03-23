package com.example.demo.domain;

public class NewsMedia {

    private int id;
    private String mediaImg;
    private String mediaName;
    private String mediaUrl;

    public NewsMedia(int id, String mediaImg, String mediaName, String mediaUrl) {
        this.id = id;
        this.mediaImg = mediaImg;
        this.mediaName = mediaName;
        this.mediaUrl = mediaUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMediaImg() {
        return mediaImg;
    }

    public void setMediaImg(String mediaImg) {
        this.mediaImg = mediaImg;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    @Override
    public String toString() {
        return "NewsMedia{" +
                "id=" + id +
                ", mediaImg='" + mediaImg + '\'' +
                ", mediaName='" + mediaName + '\'' +
                ", mediaUrl='" + mediaUrl + '\'' +
                '}';
    }
}
