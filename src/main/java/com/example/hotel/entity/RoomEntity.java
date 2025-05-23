package com.example.hotel.entity;

import jakarta.persistence.*;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}
