package com.example.LocalReservationApp.controller;

import com.example.LocalReservationApp.service.ReservationService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("")
@AllArgsConstructor
@Validated
public class ReservationController {

    private final ReservationService reservationService;
}
