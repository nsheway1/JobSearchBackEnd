package com.nat.jobsearch.controllers;

import com.nat.jobsearch.data.AdministratorRepository;
import com.nat.jobsearch.models.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdministratorController {

    // an object that represents our repository
    @Autowired
    AdministratorRepository adminRepo;

    /*
    1. Returns all administrators /
    2. Find an admin by id
    3. Add a new admin /
    4. Edit an existing admin
    5. Delete an existing admin
     */

    @GetMapping("/")    // localhost:8080/admin
    public Iterable<Administrator> listAll() {
        return adminRepo.findAll();
    }

    // adding a new admin
    @PostMapping("/")
    public Administrator saveAdmin(@RequestBody Administrator admin) {
        return adminRepo.save(admin);
    }
}
