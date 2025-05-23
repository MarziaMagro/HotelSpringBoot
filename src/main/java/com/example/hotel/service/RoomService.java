package com.example.hotel.service;

import com.example.hotel.entity.RoomEntity;
import com.example.hotel.mapper.RoomMapping;
import com.example.hotel.repository.RoomRepository;
import hotel.model.RoomDtoInput;
import hotel.model.RoomDtoOutput;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    //POST /rooms
    public RoomEntity createRoom(RoomDtoInput roomDto) {
        RoomEntity roomEntity = RoomMapping.convToEntity(roomDto);
      RoomEntity dbEntity = roomRepository.searchByRoomNumber(roomEntity.getRoomNumber());
      if(dbEntity != null)  {
          throw new RuntimeException("Room already present");
      }
      return roomRepository.save(roomEntity);
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
    public List<RoomDtoOutput> getAvailableRooms() {


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
