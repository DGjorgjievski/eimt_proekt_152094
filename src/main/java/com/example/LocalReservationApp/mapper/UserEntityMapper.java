package com.example.LocalReservationApp.mapper;

import com.example.LocalReservationApp.dal.entity.LocalEntity;
import com.example.LocalReservationApp.dal.entity.UserEntity;
import com.example.LocalReservationApp.domain.LocalModel;
import com.example.LocalReservationApp.domain.UserModel;
import com.example.LocalReservationApp.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserEntityMapper {

    UserEntityMapper MAPPER = Mappers.getMapper(UserEntityMapper.class);

    default UserModel toModel(UserEntity userEntity) {
        return UserModel.builder()
                        .name(userEntity.getName())
                        .surName(userEntity.getSurName())
                        .points(userEntity.getPoints())
                        .isManager(userEntity.getIsManager())
                        .password(userEntity.getPassword())
                        .userName(userEntity.getUserName())
                        .build();
    }

    default UserEntity toEntity(UserModel userModel) {
        return UserEntity.builder()
                         .name(userModel.getName())
                         .surName(userModel.getSurName())
                         .points(userModel.getPoints())
                         .isManager(userModel.getIsManager())
                         .password(userModel.getPassword())
                         .userName(userModel.getUserName())
                         .build();
    }

    default UserDto toDto(UserModel userModel) {
        return UserDto.builder()
                      .name(userModel.getName())
                      .surName(userModel.getSurName())
                      .points(userModel.getPoints())
                      .isManager(userModel.getIsManager())
                      .userName(userModel.getUserName())
                      .build();
    }
}
