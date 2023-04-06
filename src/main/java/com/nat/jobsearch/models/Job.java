package com.nat.jobsearch.models;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Job {
     @Id
     @SequenceGenerator(
             name="job_sequence",
             sequenceName = "job_sequence",
             allocationSize = 1
     )
     @GeneratedValue(
             strategy = GenerationType.SEQUENCE,
             generator = "job_sequence"
     )     // SQL will generate its value each time
     @NotBlank
     private Long id;
     @NotBlank
     @Size(min = 15, max= 250)
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
