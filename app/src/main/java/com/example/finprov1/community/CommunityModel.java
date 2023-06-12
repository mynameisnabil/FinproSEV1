package com.example.finprov1.community;

import java.io.Serializable;

public class CommunityModel{

    private String title;

    private String author_location;

    private int imageResourceId;

    private String description;

public CommunityModel(String title, String author_location, int imageResourceId, String description) {
        this.title = title;
        this.author_location = author_location;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor_location() {
        return author_location;
    }

    public void setAuthor_location(String author_location) {
        this.author_location = author_location;
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
