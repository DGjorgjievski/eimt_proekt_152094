package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationJpaRepository extends JpaRepository<ReservationEntity, Long> {}
