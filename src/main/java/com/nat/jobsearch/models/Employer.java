package com.nat.jobsearch.models;

public class Employer {
    private Long id;
    private String name;
    private String address;
    private String focal_person;
    private String contact_information;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getContact_information() {
        return contact_information;
    }

    public void setContact_information(String contact_information) {
        this.contact_information = contact_information;
    }
}
