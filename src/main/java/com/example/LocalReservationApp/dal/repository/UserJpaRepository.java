package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {

    @Query(value = "select * from user_table where user_name = :username and password = :password", nativeQuery = true)
    Optional<UserEntity> checkIfUserExists(String username, String password);
}
