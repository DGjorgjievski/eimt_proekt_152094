package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.dal.entity.ReservationEntity;
import com.example.LocalReservationApp.dal.entity.UserEntity;
import com.example.LocalReservationApp.dal.repository.ReservationRepository;
import com.example.LocalReservationApp.domain.ReservationModel;
import com.example.LocalReservationApp.domain.UserModel;
import com.example.LocalReservationApp.mapper.ReservationEntityMapper;
import com.example.LocalReservationApp.mapper.UserEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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

    @Override
    public void deleteById(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public void confirmReservation(Long id) {
        reservationRepository.confirmReservation(id);
    }

    @Override
    public ReservationModel save(ReservationModel reservationModel) {
        ReservationEntity entity = reservationRepository.save(ReservationEntityMapper.MAPPER.toEntity(reservationModel));
        return ReservationEntityMapper.MAPPER.toModel(entity);
    }

    @Override
    public ReservationModel findById(Long id) {
        ReservationEntity reservationEntity = reservationRepository.findById(id)
                                              .orElseThrow(EntityNotFoundException::new);
        return ReservationEntityMapper.MAPPER.toModel(reservationEntity);
    }
}
