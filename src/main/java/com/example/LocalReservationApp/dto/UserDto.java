package com.example.LocalReservationApp.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String name;

    private String surName;

    private String userName;

    private Double points;

    private Boolean isManager;
}
