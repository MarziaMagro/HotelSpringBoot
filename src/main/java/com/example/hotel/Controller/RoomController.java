package com.example.hotel.Controller;

import com.example.hotel.Service.RoomService;
import com.example.hotel.api.RoomsApi;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RoomController implements RoomsApi {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

}
