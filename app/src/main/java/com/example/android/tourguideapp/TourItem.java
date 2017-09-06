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

    public int getImage() {
        return mImage;
    }

    public String getInformation() {
        return mInformation;
    }

    public String getLocation() {
        return mLocation;
    }
}
