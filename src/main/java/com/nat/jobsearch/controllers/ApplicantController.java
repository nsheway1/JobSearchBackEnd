package com.nat.jobsearch.controllers;

import com.nat.jobsearch.data.ApplicantRepository;
import com.nat.jobsearch.models.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("applicant")
public class ApplicantController {

    @Autowired
    ApplicantRepository applicantRepository;

    @GetMapping("/")
    public Iterable<Applicant> listAll(){return applicantRepository.findAll();}

    @PostMapping("/")
    public Applicant saveApplicant(@RequestBody Applicant applicant){return applicantRepository.save(applicant);}
}
