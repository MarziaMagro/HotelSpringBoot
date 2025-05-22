package com.example.hotel.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @Id
    private Integer customerId;

    @Id
    private Integer roomId;

    @ManyToOne
    private RoomEntity roomEntity;

    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public ReservationEntity(Integer id, Integer customerId, Integer roomId, LocalDate checkInDate, LocalDate checkOutDate) {
        this.id = id;
        this.customerId = customerId;
        this.roomEntity = roomEntity;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public ReservationEntity() {
    }

}
