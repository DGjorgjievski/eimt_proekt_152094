package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.TableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableJpaRepository extends JpaRepository<TableEntity, Long> {}
