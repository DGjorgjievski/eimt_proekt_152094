package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    void save(UserEntity userEntity);

    List<UserEntity> findAll();

    Optional<UserEntity> findById(Long id);

    Optional<UserEntity> checkIfUserExists(String username, String password);
}
