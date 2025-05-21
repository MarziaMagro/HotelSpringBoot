package com.example.hotel.Service;
import com.example.hotel.Repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

//
//    //TODO: GET /rooms
//    public List<RoomDto> getAllRooms() {
//        return null;
//    }
//
//    // TODO: GET /rooms/available
//    public List<RoomDto> getAvailableRooms() {
//        return null;
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
//    //TODO: GET/ roomById
//    public RoomDto getRoomById(Integer id) {
//        return null;
//    }
}
