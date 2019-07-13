package com.example.androidsqlitedemo.model;

public class User {
    String sName;
    String fName;
    String contact;
    String number;

    public User(String sName, String fName, String contact, String number) {
        this.sName = sName;
        this.fName = fName;
        this.contact = contact;
        this.number = number;
    }

    public User() {
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "sName='" + sName + '\'' +
                ", fName='" + fName + '\'' +
                ", contact='" + contact + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

