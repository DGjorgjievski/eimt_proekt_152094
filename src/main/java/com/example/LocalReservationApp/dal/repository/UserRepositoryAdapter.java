package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
@AllArgsConstructor
public class UserRepositoryAdapter implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    @Override
    public void save(UserEntity userEntity) {
        userJpaRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> findAll() {
        return userJpaRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return userJpaRepository.findById(id);
    }
    @Override
    public Optional<UserEntity> checkIfUserExists(String username, String password) {
        return userJpaRepository.checkIfUserExists(username, password);
    }
}
