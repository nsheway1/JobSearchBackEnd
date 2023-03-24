package com.nat.jobsearch.models;

import jakarta.persistence.Entity;

@Entity
public class Applicant extends AbstractUser{
    private String address;
    private String additional_information;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdditional_information() {
        return additional_information;
    }

    public void setAdditional_information(String additional_information) {
        this.additional_information = additional_information;
    }
}
