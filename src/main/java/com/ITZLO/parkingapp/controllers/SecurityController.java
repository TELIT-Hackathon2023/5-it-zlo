package com.ITZLO.parkingapp.controllers;

import com.ITZLO.parkingapp.models.RegistrationModel;
import com.ITZLO.parkingapp.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class SecurityController {

    private final UserService userService;

    @GetMapping("/mapa")
    public String mapa(){
        return "map";
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(RegistrationModel registration){
        userService.registerUserByRegistrationModel(registration);
        return "index";
    }
}
