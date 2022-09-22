package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.dal.repository.TableRepository;
import com.example.LocalReservationApp.domain.TableModel;
import com.example.LocalReservationApp.mapper.TableEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TableServiceImpl implements TableService {

    private final TableRepository tableRepository;

    @Override
    public List<TableModel> findAll() {
        return tableRepository.findAll()
                              .stream()
                              .map(TableEntityMapper.MAPPER::toModel)
                              .collect(Collectors.toList());
    }
}
