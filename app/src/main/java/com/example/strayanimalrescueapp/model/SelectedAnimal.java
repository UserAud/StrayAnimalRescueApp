package com.example.strayanimalrescueapp.model;


public class SelectedAnimal {
    String name;
    String description;
    String location;
    String status;
    String neuteredStatus;
    String feeding;
    int imageURL;

    public SelectedAnimal(String name, String description, String location, String status, String neuteredStatus, String feeding, int imageURL) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.status = status;
        this.neuteredStatus = neuteredStatus;
        this.feeding = feeding;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNeuteredStatus() {
        return neuteredStatus;
    }

    public void setNeuteredStatus(String neuteredStatus) {
        this.neuteredStatus = neuteredStatus;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    public int getImageURL() {
        return imageURL;
    }

    public void setImageURL(int imageURL) {
        this.imageURL = imageURL;
    }
}
