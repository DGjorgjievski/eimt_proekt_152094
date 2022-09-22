package com.example.LocalReservationApp.dto;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LocalDto {

    private String name;

    private String location;

    private Integer totalSpaces;
}
