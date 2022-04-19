package com.thyago.schedules.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.thyago.schedules.repositories.StudentsRepository;
import com.thyago.schedules.models.Students;

@Service
public class CreateStudentService {

    @Autowired
    StudentsRepository studentRepository;

    private BCryptPasswordEncoder passwordEnconder() {
        return new BCryptPasswordEncoder();
    }

    public Students create(Students students) {

        Students existsStudent = studentRepository.findByLogin(students.getLogin());

        if (existsStudent != null) {
            throw new Error("Login já registrado!");
        }

        students.setPassword(passwordEnconder().encode(students.getPassword()));

        Students createStudent = studentRepository.save(students);

        return createStudent;
    }

    public Students update(Students students) {

        Students verifyPassword = studentRepository.findByLogin(students.getPassword());

        if (verifyPassword != null) {
            throw new Error("Login já registrado!");
        }

        students.setPassword(passwordEnconder().encode(students.getPassword()));

        Students createStudent = studentRepository.save(students);

        return createStudent;
    }

}
