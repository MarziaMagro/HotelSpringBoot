package com.example.hotel.service;

import com.example.hotel.entity.RoomEntity;
import com.example.hotel.mapper.RoomMapping;
import com.example.hotel.repository.RoomRepository;
import hotel.model.RoomDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    //TODO:  POST /rooms
    public RoomEntity createRoom(RoomDto roomDto) {
        RoomEntity roomEntity = new RoomEntity();
        roomRepository.save(roomEntity);
        return RoomMapping.convToEntity(roomDto);
    }

    //GET /rooms
    public List<RoomEntity> getAllRooms() {
        List<RoomEntity> roomEntityList = roomRepository.findAll();
        return roomEntityList;
    }

    //TODO: GET/ roomById
    public RoomEntity getRoomById(Integer roomId) {
        RoomEntity roomEntity = roomRepository.findById(roomId).orElseThrow(() -> new EntityNotFoundException("Room not found with ID: " + roomId));
        return roomEntity;
    }


    //     TODO: GET /rooms/available
    public List<RoomDto> getAvailableRooms() {


        return null;
//    }
//

//
//    //TODO:
//    public RoomDto updateRoomAvailability(Integer id, boolean availability) {
//        return null;
//    }
//

    }
}
