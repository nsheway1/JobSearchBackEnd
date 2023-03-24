package com.nat.jobsearch.models;

import jakarta.persistence.Entity;

@Entity
public class Job {
     private Long id;
     private String name;
     private String description;
     private String location;
     private String employerId;

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }
     public String getDescription(){
          return description;
     }
     public String getLocation(){
          return location;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public void setLocation(String location) {
          this.location = location;
     }

     public void setEmployerId(String employerId) {
          this.employerId = employerId;
     }

     public String getEmployerId(){
          return employerId;
     }
}
