package com.ITZLO.parkingapp.services.impl;

import com.ITZLO.parkingapp.models.User;
import com.ITZLO.parkingapp.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with email: "+username+" not found"));
        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getEmail())
                .authorities("USER")
                .password(user.getPassword())
                .build();
    }
}
