package com.ITZLO.parkingapp.services.impl;

import com.ITZLO.parkingapp.models.RegistrationModel;
import com.ITZLO.parkingapp.models.User;
import com.ITZLO.parkingapp.repositories.UserRepository;
import com.ITZLO.parkingapp.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User registerUserByRegistrationModel(RegistrationModel registrationModel) {
        User user = User.builder()
                .name(registrationModel.getName())
                .email(registrationModel.getEmail())
                .surname(registrationModel.getSurname())
                .licence_plate_number(registrationModel.getLicence_plate_number())
                .company_card(registrationModel.getCompany_card())
                .password(passwordEncoder.encode(registrationModel.getPassword()))
                .build();

        repository.save(user);

        return user;
    }
}
