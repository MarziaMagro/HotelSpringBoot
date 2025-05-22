package com.example.hotel.Controller;
import com.example.hotel.model.ReservationDto;
import org.springframework.http.ResponseEntity;
import com.example.hotel.api.ReservationsApi;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController implements ReservationsApi {


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
