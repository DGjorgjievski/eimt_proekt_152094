package com.example.LocalReservationApp.domain;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LocalModel {

    private String name;

    private String location;

    private Integer totalSpaces;
}
