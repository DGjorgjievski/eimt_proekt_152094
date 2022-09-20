package com.example.LocalReservationApp.domain;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationModel {

    private Long userId;

    private Long tableId;

    private LocalDateTime dateTime;

    private Boolean isConfirmed;
}
