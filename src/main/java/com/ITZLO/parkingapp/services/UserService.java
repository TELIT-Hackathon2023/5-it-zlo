package com.ITZLO.parkingapp.services;

import com.ITZLO.parkingapp.models.RegistrationModel;
import com.ITZLO.parkingapp.models.User;

public interface UserService {
    User registerUserByRegistrationModel(RegistrationModel registrationModel);
}
