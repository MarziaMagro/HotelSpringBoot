package com.example.hotel.Service;

import com.example.hotel.Entity.ReservationEntity;
import com.example.hotel.Entity.RoomEntity;
import com.example.hotel.Mapper.ReservationMapping;
import com.example.hotel.Repository.ReservationRepository;
import com.example.hotel.Repository.RoomRepository;
import com.example.hotel.model.ReservationDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final RoomRepository roomRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository, RoomRepository roomRepository) {
        this.reservationRepository = reservationRepository;
        this.roomRepository = roomRepository;
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

    // TODO: DELETE /reservations/{id}
    public void deleteReservation(Integer reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    //TODO GET BY ID
    public ReservationDto getReservationById(Integer reservationId) {
        return reservationRepository.findById(reservationId).map(ReservationMapping::convToDto)
                .orElseThrow(() -> new EntityNotFoundException("Reservation not found with ID: " + reservationId));
    }

    //TODO : PATCH
    public ReservationDto updateReservation(Integer id, ReservationDto reservationDto) {
        ReservationEntity reservationEntity = reservationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Reservation not found with ID: " + id));
        reservationEntity.setCheckInDate(reservationDto.getStartDate());
        reservationEntity.setCheckOutDate(reservationDto.getEndDate());
        reservationEntity.setRoomId(reservationDto.getRoomId());
        ReservationEntity updated = reservationRepository.save(reservationEntity);
        return ReservationMapping.convToDto(updated);
    }

    //TODO: UPDATE AVAILABILITY
    public void updateRoomAvailabilityAfterReservation(Integer reservationId) {
        ReservationEntity reservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> new EntityNotFoundException("Reservation not found with ID: " + reservationId));

        Integer roomId = reservation.getRoomId();
        RoomEntity roomEntity = roomRepository.findById(roomId)
                .orElseThrow(() -> new EntityNotFoundException("Room not found with ID: " + roomId));

        roomEntity.setAvailability(false);
        roomRepository.save(roomEntity);

    }


}
