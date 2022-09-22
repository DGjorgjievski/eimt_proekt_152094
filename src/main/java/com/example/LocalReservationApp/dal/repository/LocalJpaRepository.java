package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.LocalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalJpaRepository extends JpaRepository<LocalEntity, Long> {}
