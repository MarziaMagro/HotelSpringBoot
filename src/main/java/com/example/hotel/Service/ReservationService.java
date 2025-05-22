package com.example.hotel.Service;

import com.example.hotel.Entity.ReservationEntity;
import com.example.hotel.Mapper.ReservationMapping;
import com.example.hotel.Repository.ReservationRepository;
import com.example.reservation.model.ReservationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    // TODO:  GET /reservations
    public List<ReservationDto> getAllReservations() {
        return ReservationMapping.listDto(reservationRepository.findAll());
    }

    // POST /reservations
    public ReservationDto createReservation(ReservationDto reservationDto) {
        ReservationEntity reservation = ReservationMapping.convToEntity(reservationDto);
        reservation = reservationRepository.save(reservation);
        return ReservationMapping.convToDto(reservation);
    }

    //    // TODO: DELETE /reservations/{id}
    public void deleteReservation(Integer reservationId) {
        reservationRepository.deleteById(reservationId);
    }
//
//    //TODO GET BY ID
//    public ReservationDto getReservationById(Integer id) {
//        return null;
//    }
//
//    //TODO : PUT/PATCH
//    public ReservationDto updateReservation(Integer id, ReservationDto reservationDto) {
//        return null;
//    }
//
//    //TODO: UPDATE AVAILABILITY
//    public void updateRoomAvailabilityAfterReservation(Integer id) {
//
//    }


}
