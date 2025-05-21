package com.example.hotel.Service;

import com.example.hotel.Mapper.ReservationMapping;
import com.example.hotel.Repository.ReservationRepository;
import com.example.hotel.model.ReservationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    // TODO:  GET /reservations
    public List<ReservationDto> getAllReservations() {
        /* return ReservationMapping.listDto(ReservationRepository.findAll()); */
        return List.of();
    }

    // TODO: POST /reservations
    public ReservationDto createReservation(ReservationDto reservationDto) {
        return null;
    }

    // TODO: DELETE /reservations/{id}
    public void deleteReservation(Integer id) {

    }

    //TODO GET BY ID
    public ReservationDto getReservationById(Integer id) {
        return null;
    }

    //TODO : PUT/PATCH
    public ReservationDto updateReservation(Integer id, ReservationDto reservationDto) {
        return null;
    }

    //TODO: UPDATE AVAILABILITY
    public void updateRoomAvailabilityAfterReservation(Integer id) {

    }


}
