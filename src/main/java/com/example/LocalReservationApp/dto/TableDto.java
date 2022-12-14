package com.example.LocalReservationApp.dto;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TableDto {

    private Long id;

    private Integer idNumber;

    private Integer chairNumber;

    private Long localId;
}
