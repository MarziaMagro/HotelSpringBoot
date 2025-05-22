package com.example.hotel.Controller;
import com.example.reservation.api.ReservationsApi;
import com.example.reservation.model.ReservationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;


@RestController
public class ReservationController implements ReservationsApi {

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return ReservationsApi.super.getRequest();
    }

    @Override
    public ResponseEntity<ReservationDto> addReservation(ReservationDto reservationDto) {
        return ReservationsApi.super.addReservation(reservationDto);
    }

    @Override
    public ResponseEntity<Void> deleteReservation(Integer id) {
        return ReservationsApi.super.deleteReservation(id);
    }

    @Override
    public ResponseEntity<List<ReservationDto>> getAllReservations() {
        return ReservationsApi.super.getAllReservations();
    }
}
