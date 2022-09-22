package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.domain.UserModel;

import java.util.List;

public interface UserService {

    List<UserModel> findAll();

    void save(UserModel userModel);

    UserModel findById(Long id);

    UserModel checkIfUserExists(String username, String password);
}
