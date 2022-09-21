package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.domain.ReservationModel;
import com.example.LocalReservationApp.domain.UserModel;

import java.util.List;

public interface ReservationService {

    List<ReservationModel> findAll();

    List<ReservationModel> findAllReservationsForUser(Long userId);

    void deleteById(Long id);

    void confirmReservation(Long id);

    ReservationModel save(ReservationModel reservationModel);

    ReservationModel findById(Long id);
}
