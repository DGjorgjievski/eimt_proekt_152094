package com.example.LocalReservationApp.domain;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    private Long id;

    private String name;

    private String surName;

    private String userName;

    private String password;

    private Double points;

    private Boolean isManager;
}
