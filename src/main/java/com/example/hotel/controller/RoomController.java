package com.example.hotel.controller;
import hotel.api.RoomsApi;
import hotel.model.RoomDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController implements RoomsApi {

    @Override
    public ResponseEntity<RoomDto> addRoom(RoomDto roomDto) {
        return null;
    }

    @Override
    public ResponseEntity<List<RoomDto>> getAvailableRooms() {
        return null;
    }

    @Override
    public ResponseEntity<List<RoomDto>> getRooms() {
        return null;
    }
}
