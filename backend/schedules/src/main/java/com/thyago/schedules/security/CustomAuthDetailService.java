package com.thyago.schedules.security;

import com.thyago.schedules.models.Students;
import com.thyago.schedules.repositories.StudentsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomAuthDetailService implements UserDetailsService {
    @Autowired
    StudentsRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Students existsStudent = studentRepository.findByLogin(username);

        if (existsStudent != null) {
            throw new Error("Login já registrado!");
        }

        return AuthPrincipal.create(existsStudent);
    }

}
