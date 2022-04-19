package com.thyago.schedules.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Schedules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String schedules;

    @Column(nullable = false)
    private String date;

    private String description;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teachers teachers;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Students students;

}
