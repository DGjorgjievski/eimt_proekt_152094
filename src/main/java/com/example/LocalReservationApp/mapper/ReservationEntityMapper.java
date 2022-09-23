package com.example.LocalReservationApp.mapper;

import com.example.LocalReservationApp.dal.entity.ReservationEntity;
import com.example.LocalReservationApp.domain.ReservationModel;
import com.example.LocalReservationApp.dto.ReservationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservationEntityMapper {

    ReservationEntityMapper MAPPER = Mappers.getMapper(ReservationEntityMapper.class);

    default ReservationEntity toEntity(ReservationModel reservationModel) {
        return ReservationEntity.builder()
                                .id(reservationModel.getId())
                                .userId(reservationModel.getUserId())
                                .localName(reservationModel.getLocalName())
                                .numberOfTables(reservationModel.getNumberOfTables())
                                .dateTime(reservationModel.getDateTime())
                                .isConfirmed(reservationModel.getIsConfirmed())
                                .build();
    }

    default ReservationModel toModel(ReservationEntity reservationEntity) {
        return ReservationModel.builder()
                               .id(reservationEntity.getId())
                               .userId(reservationEntity.getUserId())
                               .localName(reservationEntity.getLocalName())
                               .numberOfTables(reservationEntity.getNumberOfTables())
                               .dateTime(reservationEntity.getDateTime())
                               .isConfirmed(reservationEntity.getIsConfirmed())
                               .build();
    }

    default ReservationDto toDto(ReservationModel reservationModel) {
        return ReservationDto.builder()
                             .id(reservationModel.getId())
                             .userId(reservationModel.getUserId())
                             .localName(reservationModel.getLocalName())
                             .numberOfTables(reservationModel.getNumberOfTables())
                             .dateTime(reservationModel.getDateTime())
                             .isConfirmed(reservationModel.getIsConfirmed())
                             .build();
    }
}
