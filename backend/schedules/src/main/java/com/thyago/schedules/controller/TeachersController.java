package com.thyago.schedules.controller;

import java.util.List;

import com.thyago.schedules.models.Teachers;
import com.thyago.schedules.repositories.TeachersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teachers")
//@CrossOrigin(origins = "http://localhost:4200")
public class TeachersController {
    @Autowired
    private TeachersRepository repository;

    @GetMapping
    public List<Teachers> list() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Teachers teachers) {
        repository.save(teachers);
    }

    @PutMapping
    public void update(@RequestBody Teachers teachers) {
        if (teachers.getId() > 0) {
            repository.save(teachers);
        }

    }

    @DeleteMapping
    public void delete(@RequestBody Teachers teachers) {
        if (teachers.getId() > 0) {
            repository.delete(teachers);
        }
    }
}
