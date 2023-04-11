package com.nat.jobsearch.controllers;

import com.nat.jobsearch.data.AdministratorRepository;
import com.nat.jobsearch.models.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")    // path variable: localhost:8080/admin/1
    public Administrator findById(@PathVariable Long id) {
        Optional<Administrator> optAdmin = adminRepo.findById(id);
        if (optAdmin.isPresent()) {
            return optAdmin.get();
        }
        else {
            return null;
        }
    }

    // adding a new admin
    @PostMapping("/")
    public Administrator saveAdmin(@RequestBody Administrator admin) {
        return adminRepo.save(admin);
    }

    // PUT request -> updating/editing records
    @PutMapping("{id}")
    public Administrator updateById(@PathVariable Long id, @RequestBody Administrator admin) {
        Optional<Administrator> optAdmin = adminRepo.findById(id);
        if (optAdmin.isPresent()) {
            // edit
            Administrator existingAdmin = optAdmin.get();
            existingAdmin.setName(admin.getName());
            existingAdmin.setContact_information(admin.getContact_information());
            existingAdmin.setUsername(admin.getUsername());
            existingAdmin.setPasswordHash(admin.getPasswordHash());
            return adminRepo.save(existingAdmin);
        }
        else {
            return null;
        }
    }


    @DeleteMapping("/{id}")    // path variable: localhost:8080/admin/1
    public boolean deleteById(@PathVariable Long id) {
        Optional<Administrator> optAdmin = adminRepo.findById(id);
        if (optAdmin.isPresent()) {
            adminRepo.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }
}
