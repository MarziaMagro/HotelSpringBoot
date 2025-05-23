package com.example.hotel.entity;

import jakarta.persistence.*;

import java.util.List;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ReservationEntity> getReservationEntity() {
        return reservationEntity;
    }

    public void setReservationEntity(List<ReservationEntity> reservationEntity) {
        this.reservationEntity = reservationEntity;
    }
}
