package com.nat.jobsearch.models;

import jakarta.persistence.Entity;

@Entity
public class Employer extends AbstractUser {

    private String address;
    private String focal_person;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFocal_person() {
        return focal_person;
    }

    public void setFocal_person(String focal_person) {
        this.focal_person = focal_person;
    }

}
