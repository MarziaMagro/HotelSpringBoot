package com.example.hotel.Service;

import com.example.hotel.Entity.RoomEntity;
import com.example.hotel.Mapper.RoomMapping;
import com.example.hotel.Repository.RoomRepository;
import com.example.hotel.model.RoomDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    //GET /rooms
    public List<RoomDto> getAllRooms() {
        List<RoomEntity> roomEntityList = roomRepository.findAll();
        List<RoomDto> roomDtoList = RoomMapping.listDto(roomEntityList);
        return roomDtoList;
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
//    //TODO:  POST /rooms
//    public RoomDto createRoom(RoomDto roomDto) {
//            Room room = RoomMapping.;
//            room = roomRepository.save(room);
//            return RoomMapping.convToDto(room);
//    }
//
//    //TODO:
//    public RoomDto updateRoomAvailability(Integer id, boolean availability) {
//        return null;
//    }
//

    }
