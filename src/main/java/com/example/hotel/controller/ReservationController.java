package com.example.hotel.controller;
import hotel.api.ReservationApi;
import hotel.model.ReservationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController implements ReservationApi {


    @Override
    public ResponseEntity<ReservationDto> addReservation(ReservationDto reservationDto) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteReservation(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<ReservationDto>> getAllReservations() {
        return null;
    }
}
