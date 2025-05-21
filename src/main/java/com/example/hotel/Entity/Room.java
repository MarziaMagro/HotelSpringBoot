package com.example.hotel.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Integer id;
    private RoomType roomType;
    private String roomNumber;
    private boolean availability;

    public Room(Integer id, RoomType roomType, String roomNumber, boolean availability) {
        this.id = id;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.availability = availability;
    }

    public Room() {
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


    public boolean getAvailability() {

        return availability;
    }

    public void setAvailability(boolean availability) {

        this.availability = availability;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
