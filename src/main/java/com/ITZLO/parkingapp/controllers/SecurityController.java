package com.ITZLO.parkingapp.controllers;

import com.ITZLO.parkingapp.models.RegistrationModel;
import com.ITZLO.parkingapp.models.User;
import com.ITZLO.parkingapp.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SecurityController {

    private final UserService userService;

    @PostMapping("/registration")
    public ResponseEntity<User> registration(@RequestBody RegistrationModel registration){
        return ResponseEntity.ok(userService.registerUserByRegistrationModel(registration));
    }
}
