package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.ReservationEntity;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@AllArgsConstructor
public class ReservationRepositoryAdapter implements ReservationRepository{

    private final ReservationJpaRepository reservationJpaRepository;

    @Override
    public ReservationEntity save(ReservationEntity reservationEntity) {
        return reservationJpaRepository.save(reservationEntity);
    }

    @Override
    public List<ReservationEntity> findAll() {
        return reservationJpaRepository.findAll();
    }

    @Override
    public List<ReservationEntity> findAllReservationsForUser(Long userId) {
        return reservationJpaRepository.findAllReservationsForUser(userId);
    }
}
