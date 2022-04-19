package com.thyago.schedules.repositories;

import com.thyago.schedules.models.Students;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Long> {

}
