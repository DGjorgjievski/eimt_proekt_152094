package com.example.LocalReservationApp.controller;

import com.example.LocalReservationApp.domain.ReservationModel;
import com.example.LocalReservationApp.domain.UserModel;
import com.example.LocalReservationApp.dto.ReservationDto;
import com.example.LocalReservationApp.dto.UserDto;
import com.example.LocalReservationApp.mapper.ReservationEntityMapper;
import com.example.LocalReservationApp.mapper.UserEntityMapper;
import com.example.LocalReservationApp.service.ReservationService;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@Log4j2
@RestController
@RequestMapping("/api/reservations")
@AllArgsConstructor
@Validated
public class ReservationController {

    private final ReservationService reservationService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ReservationDto findById(@PathVariable(name = "id") @NotNull Long id) {
        return ReservationEntityMapper.MAPPER.toDto(reservationService.findById(id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable(name = "id") @NotNull Long id) {
        reservationService.deleteById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ReservationDto> findAll() {
        return reservationService.findAll()
                                 .stream()
                                 .map(ReservationEntityMapper.MAPPER::toDto)
                                 .collect(Collectors.toList());
    }

    @PostMapping("/{id}/confirm")
    @ResponseStatus(HttpStatus.OK)
    public void confirmReservation(@PathVariable(name = "id") @NotNull Long id) {
        reservationService.confirmReservation(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public ReservationDto save(@RequestBody ReservationModel reservationModel) {
        return ReservationEntityMapper.MAPPER.toDto(reservationService.save(reservationModel));
    }
}
