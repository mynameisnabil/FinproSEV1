package com.example.finprov1.news;

public class NewsModel {
    private String title;
    private String authorLocation;
    private int imageResourceId;
    private String description;

    public NewsModel(String title, String authorLocation, int imageResourceId, String description) {
        this.title = title;
        this.authorLocation = authorLocation;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorLocation() {
        return authorLocation;
    }

    public void setAuthorLocation(String authorLocation) {
        this.authorLocation = authorLocation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
