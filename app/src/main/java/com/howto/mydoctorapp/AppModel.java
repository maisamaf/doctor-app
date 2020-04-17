package com.howto.mydoctorapp;

public class AppModel {
    String title;
    int img_thumbnail;

    public AppModel(String title, int img_thumbnail) {
        this.title = title;
        this.img_thumbnail = img_thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public int getImg_thumbnail() {
        return img_thumbnail;
    }
}
