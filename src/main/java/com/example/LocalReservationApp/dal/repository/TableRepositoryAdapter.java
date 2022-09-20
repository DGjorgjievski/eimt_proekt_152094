package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.TableEntity;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@AllArgsConstructor
public class TableRepositoryAdapter implements TableRepository {

    private final TableJpaRepository tableJpaRepository;

    @Override
    public TableEntity save(TableEntity tableEntity) {
        return tableJpaRepository.save(tableEntity);
    }

    @Override
    public List<TableEntity> findAll() {
        return tableJpaRepository.findAll();
    }
}
