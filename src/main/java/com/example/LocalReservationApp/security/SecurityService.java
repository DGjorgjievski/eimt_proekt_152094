//package com.example.LocalReservationApp.security;
//
//import com.example.LocalReservationApp.dal.entity.UserEntity;
//import com.example.LocalReservationApp.dal.repository.UserRepository;
//import com.example.LocalReservationApp.domain.UserModel;
//import com.example.LocalReservationApp.mapper.UserEntityMapper;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Log4j2
//@Service
//public class SecurityService {
//
//    private UserRepository userRepository;
//
//    @Autowired
//    public SecurityService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public UserModel getAuthenticatedUser() {
//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
//                                                                     .getAuthentication()
//                                                                     .getPrincipal();
//
//        Optional<UserEntity> userEntity = userRepository.findByUsername(userDetails.getUsername());
//
//        if (userEntity.isPresent()) {
//            return UserEntityMapper.MAPPER.toModel(userRepository.findByUsername(userDetails.getUsername())
//                                                                 .get());
//        } else {
//            throw new UsernameNotFoundException("Username '" + userDetails.getUsername() + "' does not exist");
//        }
//    }
//}
