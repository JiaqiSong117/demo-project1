package com.example.demo.domain;

public class NewsMedia {

    private int id;
    private String mediaName;
    private String introduction;
    private String mediaFrequency;
    private String url;
    private String mediaFollower;

    public NewsMedia(int id, String mediaName, String introduction, String mediaFrequency, String url, String mediaFollower) {
        this.id = id;
        this.mediaName = mediaName;
        this.introduction = introduction;
        this.mediaFrequency = mediaFrequency;
        this.url = url;
        this.mediaFollower = mediaFollower;
    }

    public int getId() {
        return id;
    }

    public String getMediaName() {
        return mediaName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getMediaFrequency() {
        return mediaFrequency;
    }

    public String getUrl() {
        return url;
    }

    public String getMediaFollower() {
        return mediaFollower;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setMediaFrequency(String mediaFrequency) {
        this.mediaFrequency = mediaFrequency;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMediaFollower(String mediaFollower) {
        this.mediaFollower = mediaFollower;
    }

    @Override
    public String toString() {
        return "NewsMedia{" +
                "id=" + id +
                ", mediaName='" + mediaName + '\'' +
                ", introduction='" + introduction + '\'' +
                ", mediaFrequency='" + mediaFrequency + '\'' +
                ", url='" + url + '\'' +
                ", mediaFollower='" + mediaFollower + '\'' +
                '}';
    }
}
