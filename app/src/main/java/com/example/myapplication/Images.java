package com.example.myapplication;

public class Images {

    private int id;
    private String description;
    private String place;
    private byte[] image;

    public Images(int id, String description, String place, byte[] image) {
        this.id = id;
        this.description = description;
        this.place = place;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
