package com.thyago.schedules.services;

//import java.util.Optional;

import com.thyago.schedules.models.Students;
import com.thyago.schedules.repositories.StudentsRepository;
import com.thyago.schedules.security.StudentDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private StudentsRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Students student = studentRepository.findByLogin(username);

        if (student.isEmpty()) {
            throw new UsernameNotFoundException("Usuário " + username + " não encontrado!");
        }

        return new StudentDetail(student);

    }

}
