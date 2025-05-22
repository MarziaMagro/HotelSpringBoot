package com.example.hotel.Controller;
import com.example.room.api.RoomsApi;
import com.example.room.model.RoomDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;


@RestController
public class RoomController implements RoomsApi {

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return RoomsApi.super.getRequest();
    }

    @Override
    public ResponseEntity<RoomDto> addRoom(RoomDto roomDto) {
        return RoomsApi.super.addRoom(roomDto);
    }

    @Override
    public ResponseEntity<List<RoomDto>> getAvailableRooms() {
        return RoomsApi.super.getAvailableRooms();
    }

    @Override
    public ResponseEntity<List<RoomDto>> getRooms() {
        return RoomsApi.super.getRooms();
    }
}
