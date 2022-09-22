package com.example.LocalReservationApp.controller;

import com.example.LocalReservationApp.service.TableService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("")
@AllArgsConstructor
@Validated
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TableController {

    private final TableService tableService;
}
