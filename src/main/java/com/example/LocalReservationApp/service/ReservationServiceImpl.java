package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.dal.entity.ReservationEntity;
import com.example.LocalReservationApp.dal.repository.ReservationRepository;
import com.example.LocalReservationApp.domain.ReservationModel;
import com.example.LocalReservationApp.mapper.ReservationEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public List<ReservationModel> findAll() {
        return reservationRepository.findAll()
                                    .stream()
                                    .map(ReservationEntityMapper.MAPPER::toModel)
                                    .collect(Collectors.toList());
    }

    @Override
    public List<ReservationModel> findAllReservationsForUser(Long userId) {
        List<ReservationEntity> reservationEntities = reservationRepository.findAllReservationsForUser(userId);
        return reservationEntities.stream()
                                  .map(ReservationEntityMapper.MAPPER::toModel)
                                  .collect(Collectors.toList());
    }
}
