package com.example.hotel.Controller;

import com.example.hotel.Service.ReservationService;
import com.example.hotel.api.ReservationsApi;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReservationController implements ReservationsApi {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

}
