package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.ReservationEntity;
import com.example.LocalReservationApp.dal.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository {

    ReservationEntity save(ReservationEntity reservationEntity);

    List<ReservationEntity> findAll();

    List<ReservationEntity> findAllReservationsForUser(Long userId);

    void deleteById(Long id);

    void confirmReservation(Long id);

    Optional<ReservationEntity> findById(Long id);
}
