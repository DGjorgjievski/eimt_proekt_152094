package com.example.LocalReservationApp.dal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "reservation")
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "table_seq")
    @SequenceGenerator(name = "table_seq", sequenceName = "table_seq", allocationSize = 1)
    private Long id;

    @Column
    private Long userId;

    @Column
    private Long tableId;

    @Column
    private LocalDateTime dateTime;

    @Column
    private Boolean isConfirmed;
}
