package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.domain.TableModel;

import java.util.List;

public interface TableService {

    List<TableModel> findAll();
}
