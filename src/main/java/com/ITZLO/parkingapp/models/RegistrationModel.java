package com.ITZLO.parkingapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegistrationModel {
    private String name;
    private String surname;
    private String email;
    private String licence_plate_number;
    private String company_card;
    private String password;
}
