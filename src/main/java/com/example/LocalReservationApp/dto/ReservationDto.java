package com.example.LocalReservationApp.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {

    private Long userId;

    private Long tableId;

    private LocalDateTime dateTime;

    private Boolean isConfirmed;
}
