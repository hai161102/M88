package com.haiprj.apps.m88.model;

import java.util.Date;

public class TeammateModel {
    private String fullName;
    private int birthYear;
    private Date realBirthDay;
    private String country;
    private float height;
    private String position;
    private String description;

    public TeammateModel(String fullName, int birthDay, String country, float height, String position, String description) {
        this.fullName = fullName;
        this.birthYear = birthDay;
        this.country = country;
        this.height = height;
        this.position = position;
        this.description = description;
    }

    public TeammateModel() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRealBirthDay() {
        return realBirthDay;
    }

    public void setRealBirthDay(Date realBirthDay) {
        this.realBirthDay = realBirthDay;
    }
}
