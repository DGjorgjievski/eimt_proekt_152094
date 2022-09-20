package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.domain.UserModel;
import org.mapstruct.control.MappingControl;

import java.util.List;

public interface UserService {

    List<UserModel> findAll();

    void save(UserModel userModel);

}
