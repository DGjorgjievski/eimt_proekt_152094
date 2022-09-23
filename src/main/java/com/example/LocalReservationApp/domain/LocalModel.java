package com.example.LocalReservationApp.domain;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LocalModel {

    private Long id;

    private String name;

    private String location;

    private Integer totalSpaces;

    private String localImage;
}
