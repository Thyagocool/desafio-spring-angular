package com.thyago.schedules.security;

import java.util.Collection;

import com.thyago.schedules.models.Students;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AuthPrincipal implements UserDetails {

    private String login;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public AuthPrincipal(Students students) {
        this.login = students.getLogin();
        this.password = students.getPassword();

    }

    public static AuthPrincipal create(Students students) {
        return new AuthPrincipal(students);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
