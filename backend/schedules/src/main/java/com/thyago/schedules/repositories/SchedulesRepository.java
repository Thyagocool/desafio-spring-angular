package com.thyago.schedules.repositories;

import com.thyago.schedules.models.Schedules;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchedulesRepository extends JpaRepository<Schedules, Long> {

}
