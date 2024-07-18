package com.example.adapetertest;

public class Contact {

    private String contactName;
    private String contactNo;
    private String city;
    private int imageId;

    public Contact(String contactName, String contactNo, String city, int imageId) {
        this.contactName = contactName;
        this.contactNo = contactNo;
        this.city = city;
        this.imageId = imageId;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getCity() {
        return city;
    }

    public int getImageId() {
        return imageId;
    }
}
