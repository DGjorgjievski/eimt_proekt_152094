package com.example.LocalReservationApp.domain;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationModel {

    private Long id;

    private Long userId;

    private  String localName;

    private Integer numberOfTables;

    private LocalDateTime dateTime;

    private Boolean isConfirmed;
}
