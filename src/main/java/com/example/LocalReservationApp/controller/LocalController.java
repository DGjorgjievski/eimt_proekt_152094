package com.example.LocalReservationApp.controller;

import com.example.LocalReservationApp.dto.LocalDto;
import com.example.LocalReservationApp.mapper.LocalEntityMapper;
import com.example.LocalReservationApp.service.LocalService;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@RestController
@RequestMapping("/api/locals")
@AllArgsConstructor
@Validated
public class LocalController {

    private final LocalService localService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<LocalDto> findAll() {
        return localService.findAll()
                           .stream()
                           .map(LocalEntityMapper.MAPPER::toDto)
                           .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LocalDto findById(@PathVariable(name = "id") @NotNull Long id) {
        return LocalEntityMapper.MAPPER.toDto(localService.findById(id));
    }

}
