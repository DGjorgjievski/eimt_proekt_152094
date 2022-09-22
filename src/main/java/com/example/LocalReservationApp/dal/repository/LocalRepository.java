package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.LocalEntity;

import java.util.List;
import java.util.Optional;

public interface LocalRepository {

    LocalEntity save(LocalEntity localEntity);

    List<LocalEntity> findAll();

    Optional<LocalEntity> findById(Long id);
}
