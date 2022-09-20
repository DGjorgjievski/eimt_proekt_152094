package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.domain.ReservationModel;

import java.util.List;

public interface ReservationService {

    List<ReservationModel> findAll();
}
