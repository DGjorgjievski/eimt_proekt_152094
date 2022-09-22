package com.example.LocalReservationApp.dto;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LocalDto {

    private Long id;

    private String name;

    private String location;

    private Integer totalSpaces;

    private String localImage;
}
