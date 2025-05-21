package com.example.hotel.Service;
import com.example.hotel.model.RoomDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    //TODO: GET /rooms
    public List<RoomDto> getAllRooms() {

        return null;
    }

    // TODO: GET /rooms/available
    public List<RoomDto> getAvailableRooms() {
        return null;
    }

    //TODO:  POST /rooms
    public RoomDto createRoom(RoomDto roomDto) {
        return roomDto;
    }

    //TODO:
    public RoomDto updateRoomAvailability(Integer id, boolean availability) {
        return null;
    }

    //TODO: GET/ roomById
    public RoomDto getRoomById(Integer id) {
        return null;
    }
}
