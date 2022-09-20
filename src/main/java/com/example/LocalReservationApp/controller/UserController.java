package com.example.LocalReservationApp.controller;

import com.example.LocalReservationApp.domain.UserModel;
import com.example.LocalReservationApp.dto.UserDto;
import com.example.LocalReservationApp.mapper.UserEntityMapper;
import com.example.LocalReservationApp.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
@Validated
public class UserController {

    private final UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> findAll() {
        return userService.findAll()
                          .stream()
                          .map(UserEntityMapper.MAPPER::toDto)
                          .collect(Collectors.toList());
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public void save(@RequestBody UserModel userModel) {
        userService.save(userModel);
    }

//    @GetMapping("/me")
//    public UserDto findAuthenticatedCustomer() {
//        return UserEntityMapper.MAPPER.toDto(securityService.getAuthenticatedUser());
//    }
}
