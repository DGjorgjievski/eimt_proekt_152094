package com.example.LocalReservationApp.dal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "local")
public class LocalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "local_seq")
    @SequenceGenerator(name = "local_seq", sequenceName = "local_seq", allocationSize = 1)
    private Long id;

    @Column
    private String name;

    @Column
    private String location;

    @Column
    private Integer totalSpaces;
}
