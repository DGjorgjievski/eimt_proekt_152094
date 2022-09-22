package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.dal.entity.UserEntity;
import com.example.LocalReservationApp.dal.repository.UserRepository;
import com.example.LocalReservationApp.domain.UserModel;
import com.example.LocalReservationApp.mapper.UserEntityMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Log4j2
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public List<UserModel> findAll() {
        return userRepository.findAll()
                             .stream()
                             .map(UserEntityMapper.MAPPER::toModel)
                             .collect(Collectors.toList());
    }

    @Override
    public void save(UserModel userModel) {
        userRepository.save(UserEntityMapper.MAPPER.toEntity(userModel));
    }

    @Override
    public UserModel findById(Long id) {
        UserEntity userEntity = userRepository.findById(id)
                                              .orElseThrow(EntityNotFoundException::new);
        return UserEntityMapper.MAPPER.toModel(userEntity);
    }

    @Override
    public UserModel checkIfUserExists(String username, String password) {
        Optional<UserEntity> user = userRepository.checkIfUserExists(username, password);
        if (user.isPresent()) {
            return UserEntityMapper.MAPPER.fromEntity(user);
        } else {
            return UserModel.builder()
                            .name(null)
                            .surName(null)
                            .points(null)
                            .isManager(null)
                            .password(null)
                            .userName(null)
                            .build();
        }
    }
}
