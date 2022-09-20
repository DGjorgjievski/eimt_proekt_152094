package com.example.LocalReservationApp.mapper;

import com.example.LocalReservationApp.dal.entity.ReservationEntity;
import com.example.LocalReservationApp.domain.ReservationModel;
import com.example.LocalReservationApp.dto.ReservationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservationEntityMapper {

    ReservationEntityMapper MAPPER = Mappers.getMapper(ReservationEntityMapper.class);

    ReservationModel toModel(ReservationEntity reservationEntity);

    ReservationDto toDto(ReservationModel reservationModel);
}
