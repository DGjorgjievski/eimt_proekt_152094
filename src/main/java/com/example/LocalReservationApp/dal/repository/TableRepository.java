package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.TableEntity;

import java.util.List;

public interface TableRepository {

    TableEntity save(TableEntity tableEntity);

    List<TableEntity> findAll();
}
