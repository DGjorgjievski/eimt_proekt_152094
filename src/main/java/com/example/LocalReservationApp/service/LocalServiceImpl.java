package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.dal.entity.LocalEntity;
import com.example.LocalReservationApp.dal.repository.LocalRepository;
import com.example.LocalReservationApp.domain.LocalModel;
import com.example.LocalReservationApp.mapper.LocalEntityMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Log4j2
@Service
@AllArgsConstructor
public class LocalServiceImpl implements LocalService {

    private final LocalRepository localRepository;

    @Override
    public List<LocalModel> findAll() {
        return localRepository.findAll()
                              .stream()
                              .map(LocalEntityMapper.MAPPER::toModel)
                              .collect(Collectors.toList());
    }

    @Override
    public LocalModel findById(Long id) {

        Optional<LocalEntity> localEntity = localRepository.findById(id);

        if (localEntity.isEmpty()) {

            log.error("The searched id: {} was not found", id);
        }
        return LocalEntityMapper.MAPPER.toModel(localRepository.findById(id)
                                                               .get());
    }
}
