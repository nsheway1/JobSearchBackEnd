package com.nat.jobsearch.controllers;

import com.nat.jobsearch.data.EmployerRepository;
import com.nat.jobsearch.models.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employer")
public class EmployerController {

    @Autowired
    EmployerRepository employerRepository;

    @GetMapping("/")
    public Iterable<Employer> listAll() {return employerRepository.findAll();}

    @PostMapping("/")
    public Employer saveEmployer(@RequestBody Employer employer) {return employerRepository.save(employer);}
}
