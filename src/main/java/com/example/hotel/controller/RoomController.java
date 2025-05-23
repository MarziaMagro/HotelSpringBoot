package com.example.hotel.controller;

import com.example.hotel.entity.RoomEntity;
import com.example.hotel.mapper.RoomMapping;
import com.example.hotel.service.RoomService;
import hotel.api.RoomsApi;
import hotel.model.RoomDtoInput;
import hotel.model.RoomDtoOutput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController implements RoomsApi {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @Override
    public ResponseEntity<RoomDtoOutput> addRoom(RoomDtoInput roomDto) {
        RoomEntity room = roomService.createRoom(roomDto);
        RoomDtoOutput dtoCreatedRoom = RoomMapping.convToDto(room);
        return ResponseEntity.ok(dtoCreatedRoom);
    }

    @Override
    public ResponseEntity<List<RoomDtoOutput>> getAvailableRooms() {
        return null;
    }

    @Override
    public ResponseEntity<List<RoomDtoOutput>> getRooms() {
        List<RoomEntity> listOfRooms = roomService.getAllRooms();
        List<RoomDtoOutput> allRooms = RoomMapping.listDto(listOfRooms);
        return ResponseEntity.ok(allRooms);
    }
}
