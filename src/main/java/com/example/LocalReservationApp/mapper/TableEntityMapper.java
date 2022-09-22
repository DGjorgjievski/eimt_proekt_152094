package com.example.LocalReservationApp.mapper;

import com.example.LocalReservationApp.dal.entity.TableEntity;
import com.example.LocalReservationApp.domain.TableModel;
import com.example.LocalReservationApp.dto.TableDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TableEntityMapper {

    TableEntityMapper MAPPER = Mappers.getMapper(TableEntityMapper.class);

    TableModel toModel(TableEntity tableEntity);

    TableDto toDto(TableModel tableModel);
}
