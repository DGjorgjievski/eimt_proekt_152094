package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.LocalEntity;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
@AllArgsConstructor
public class LocalRepositoryAdapter implements LocalRepository{

    private final LocalJpaRepository localJpaRepository;

    @Override
    public LocalEntity save(LocalEntity localEntity) {
        return localJpaRepository.save(localEntity);
    }

    @Override
    public List<LocalEntity> findAll() {
        return localJpaRepository.findAll();
    }

    @Override
    public Optional<LocalEntity> findById(Long id) {
        return localJpaRepository.findById(id);
    }
}
