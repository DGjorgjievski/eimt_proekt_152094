package com.example.LocalReservationApp.mapper;

import com.example.LocalReservationApp.dal.entity.LocalEntity;
import com.example.LocalReservationApp.domain.LocalModel;
import com.example.LocalReservationApp.dto.LocalDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LocalEntityMapper {

    LocalEntityMapper MAPPER = Mappers.getMapper(LocalEntityMapper.class);

    default LocalModel toModel(LocalEntity localEntity) {
        return LocalModel.builder()
                         .name(localEntity.getName())
                         .location(localEntity.getLocation())
                         .totalSpaces(localEntity.getTotalSpaces())
                         .build();
    }

    default LocalDto toDto(LocalModel localModel) {
        return LocalDto.builder()
                       .name(localModel.getName())
                       .location(localModel.getLocation())
                       .totalSpaces(localModel.getTotalSpaces())
                       .build();
    }
}
