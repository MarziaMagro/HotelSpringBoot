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
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Integer id;
    private RoomType roomType;
    private String roomNumber;
    private Boolean availability;

    public RoomEntity(Integer id, RoomType roomType, String roomNumber, boolean availability) {
        this.id = id;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.availability = availability;
    }

    public RoomEntity() {
    }

}
