package com.seanhannon.urlShort.entity;

public class URLEntity {
    private String id;
    private String longURL;
    private String shortURL;

    public URLEntity() {
    }

    public URLEntity(String id, String longURL, String shortURL) {
        this.id = id;
        this.longURL = longURL;
        this.shortURL = shortURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLongURL() {
        return longURL;
    }

    public void setLongURL(String longURL) {
        this.longURL = longURL;
    }

    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }
}
