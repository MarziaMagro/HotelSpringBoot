package com.example.hotel.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

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
    private ReservationEntity reservationEntity;

    public CustomerEntity() {
    }

    public CustomerEntity(Integer id, String name, String surname, String email, ReservationEntity reservationEntity) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.reservationEntity = reservationEntity;
    }
}
