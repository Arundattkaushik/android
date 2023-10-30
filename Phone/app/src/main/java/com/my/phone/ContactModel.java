package com.my.phone;

public class ContactModel {
    int contImage;
    String contName, contNumber;

    public ContactModel(int contImage, String contName, String contNumber) {
        this.contImage = contImage;
        this.contName = contName;
        this.contNumber = contNumber;
    }

    public ContactModel(String contName, String contNumber) {
        this.contName = contName;
        this.contNumber = contNumber;
    }
}
