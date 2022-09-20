package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.domain.LocalModel;
import com.example.LocalReservationApp.exceptions.IdNotFound;

import java.util.List;

public interface LocalService {

    List<LocalModel> findAll();

    LocalModel findById(Long id);
}
