package com.example.LocalReservationApp.domain;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TableModel {

    private Integer idNumber;

    private Integer chairNumber;

    private Long localId;
}
