package com.example.LocalReservationApp.controller;

import com.example.LocalReservationApp.domain.ReservationModel;
import com.example.LocalReservationApp.domain.UserModel;
import com.example.LocalReservationApp.dto.ReservationDto;
import com.example.LocalReservationApp.dto.UserDto;
import com.example.LocalReservationApp.mapper.ReservationEntityMapper;
import com.example.LocalReservationApp.mapper.UserEntityMapper;
import com.example.LocalReservationApp.service.ReservationService;
import com.example.LocalReservationApp.service.UserService;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Log4j2
@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
@Validated
public class UserController {

    private final UserService userService;

    private final ReservationService reservationService;

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

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto findById(@PathVariable(name = "userId") @NotNull Long userId) {
        return UserEntityMapper.MAPPER.toDto(userService.findById(userId));
    }

    @GetMapping("/{userId}/reservations")
    @ResponseStatus(HttpStatus.OK)
    public List<ReservationDto> findAllReservationsForUser(@PathVariable(name = "userId") @NotNull Long userId) {
        List<ReservationModel> reservationModels = reservationService.findAllReservationsForUser(userId);
        return reservationModels.stream()
                                .map(ReservationEntityMapper.MAPPER::toDto)
                                .collect(Collectors.toList());
    }
    @GetMapping("/check")
    @ResponseStatus(HttpStatus.OK)
    public UserDto checkIfUserExists(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        return UserEntityMapper.MAPPER.toDto(userService.checkIfUserExists(username,password));
    }

}
