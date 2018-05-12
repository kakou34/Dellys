package com.example.android.dellys;

public class Location {

    //default Id for non-imaged location object
    private static final int NO_IMAGE_PROVIDED = -1;

    //name of the location
    private String name;

    //information about the location
    private String information;

    //recourse id to the image of the location
    private int imageId = NO_IMAGE_PROVIDED;

    //getter methods to the location object's fields
    public int getImageId() {
        return imageId;
    }

    public String getInformation() {
        return information;
    }

    public String getName() {
        return name;
    }
    //No need to setters

    //method to check whether the location has an image
    public boolean hasImage() {
        return (imageId != NO_IMAGE_PROVIDED);
    }

    //public constructor for imaged items
    public Location(String name, String information, int imageId) {
        this.name = name;
        this.information = information;
        this.imageId = imageId;
    }

    //public constructor for non-imaged items
    public Location(String name, String information) {
        this.name = name;
        this.information = information;
    }
}
