package com.example.LocalReservationApp.service;

import com.example.LocalReservationApp.dal.repository.UserRepository;
import com.example.LocalReservationApp.domain.UserModel;
import com.example.LocalReservationApp.mapper.UserEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

//    @Override
//    public UserModel findAuthenticatedUser() {
//        return securityService.getAuthenticatedUser();
//    }
}
