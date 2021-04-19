package com.example.demo.domain;

public class SuggestionsAccount {
    private int id;
    private String category;
    private String twittername;
    private String twitterusername;
    private String url;
    private String filterbubblejson;

    public SuggestionsAccount(int id, String category, String twittername, String twitterusername, String url, String filterbubblejson) {
        this.id = id;
        this.category = category;
        this.twittername = twittername;
        this.twitterusername = twitterusername;
        this.url = url;
        this.filterbubblejson = filterbubblejson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTwittername() {
        return twittername;
    }

    public void setTwittername(String twittername) {
        this.twittername = twittername;
    }

    public String getTwitterusername() {
        return twitterusername;
    }

    public void setTwitterusername(String twitterusername) {
        this.twitterusername = twitterusername;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFilterbubblejson() {
        return filterbubblejson;
    }

    public void setFilterbubblejson(String filterbubblejson) {
        this.filterbubblejson = filterbubblejson;
    }

    @Override
    public String toString() {
        return "SuggestionsAccount{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", twittername='" + twittername + '\'' +
                ", twitterusername='" + twitterusername + '\'' +
                ", url='" + url + '\'' +
                ", filterbubblejson='" + filterbubblejson + '\'' +
                '}';
    }
}
