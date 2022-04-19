package com.thyago.schedules.controller;

import java.util.List;

import com.thyago.schedules.models.Students;
import com.thyago.schedules.repositories.StudentsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    private StudentsRepository repository;

    @GetMapping
    public List<Students> list() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Students students) {
        repository.save(students);
    }

    @PutMapping
    public void update(@RequestBody Students students) {
        if (students.getId() > 0) {
            repository.save(students);
        }

    }

    @DeleteMapping
    public void delete(@RequestBody Students students) {
        if (students.getId() > 0) {
            repository.delete(students);
        }
    }
}
