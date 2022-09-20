package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.ReservationEntity;

import java.util.List;

public interface ReservationRepository {

    ReservationEntity save(ReservationEntity reservationEntity);

    List<ReservationEntity> findAll();

    List<ReservationEntity> findAllReservationsForUser(Long userId);
}
