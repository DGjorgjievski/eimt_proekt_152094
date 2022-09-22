package com.example.LocalReservationApp.exceptions;

import lombok.Getter;

@Getter
public class IdNotFound extends Exception {

    private final Long id;

    public IdNotFound(String message, Long id) {
        super(message);
        this.id = id;
    }

}
