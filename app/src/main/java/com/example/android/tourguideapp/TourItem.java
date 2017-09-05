package com.example.android.tourguideapp;

public class TourItem {
    private String mTitle;
    private int mImage;
    private String mInformation;
    private String mLocation;

    public TourItem(String title, String information, String location, int image) {
        this.mTitle = title;
        this.mImage = image;
        this.mInformation = information;
        this.mLocation = location;

    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        this.mImage = image;
    }

    public String getInformation() {
        return mInformation;
    }

    public void setInformation(String information) {
        this.mInformation = information;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        this.mLocation = location;
    }
}
