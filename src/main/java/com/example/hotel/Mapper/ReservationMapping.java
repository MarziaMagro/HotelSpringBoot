package com.example.hotel.Mapper;
import com.example.hotel.Entity.CustomerEntity;
import com.example.hotel.Entity.ReservationEntity;
import com.example.reservation.model.ReservationDto;

import java.util.ArrayList;
import java.util.List;

public class ReservationMapping {

    public static ReservationDto convToDto(ReservationEntity reservation) {
        ReservationDto reservationDto = new ReservationDto();
        reservationDto.setId(reservation.getId());
        //reservationDto.setCustomer(CustomerMapping.convToDto(reservation.getCustomer()));
        reservationDto.setRoomId(reservation.getId());
        reservationDto.setStartDate(reservation.getCheckInDate());
        reservationDto.setEndDate(reservation.getCheckOutDate());
        return reservationDto;
    }

    public static ReservationEntity convToEntity(ReservationDto reservationDto) {
        ReservationEntity reservation = new ReservationEntity();
        reservation.setId(reservationDto.getId());
        reservation.setRoomId(reservationDto.getRoomId());
        reservation.setCheckOutDate(reservationDto.getEndDate());
        reservation.setCheckInDate(reservationDto.getStartDate());
        //reservation.setCustomer(reservationDto.getCustomer());
        return reservation;
    }

    public static List<ReservationEntity> listEntity(List<ReservationDto> listDto) {
        List<ReservationEntity> listEntity = new ArrayList<>();
        for (ReservationDto reservationDto : listDto) {
            ReservationEntity reservation = ReservationMapping.convToEntity(reservationDto);
            listEntity.add(reservation);
        }
        return listEntity;
    }

    public static List<ReservationDto> listDto(List<ReservationEntity> listEntity) {
        List<ReservationDto> listDto = new ArrayList<>();
        for (ReservationEntity reservation : listEntity) {
            ReservationDto reservationDto = ReservationMapping.convToDto(reservation);
            listDto.add(reservationDto);
        }
        return listDto;
    }

   // public static com.example.reservation.model.CustomerDto convToDtoRes ()
}
