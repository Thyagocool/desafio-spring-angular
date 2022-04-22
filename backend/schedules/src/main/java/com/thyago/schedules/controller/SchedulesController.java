package com.thyago.schedules.controller;

import java.util.List;

import com.thyago.schedules.models.Schedules;
import com.thyago.schedules.repositories.SchedulesRepository;

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
@RequestMapping("/schedules")
@CrossOrigin(origins = "http://localhost:4200")
public class SchedulesController {
    @Autowired
    private SchedulesRepository repository;

    @GetMapping
    public List<Schedules> list() {
        return repository.findAll();
    }

    @PostMapping(consumes = {"application/json"})
    public void save(@RequestBody Schedules schedule) {
        repository.save(schedule);
    }

    @PutMapping
    public void update(@RequestBody Schedules schedule) {
        if (schedule.getId() > 0) {
            repository.save(schedule);
        }

    }

    @DeleteMapping
    public void delete(@RequestBody Schedules schedule) {
        if (schedule.getId() > 0) {
            repository.delete(schedule);
        }
    }
}
