package com.example.hotel.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Integer id;
    private String name;
    private String surname;
    private String email;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<ReservationEntity> reservationEntity;

    public CustomerEntity() {
    }

    public CustomerEntity(Integer id, String name, String surname, String email, List<ReservationEntity> reservationEntity) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.reservationEntity = reservationEntity;
    }
}
