package com.example.hotel.mapper;
import com.example.hotel.entity.ReservationEntity;
import hotel.model.ReservationDto;

import java.util.ArrayList;
import java.util.List;

public class ReservationMapping {

    public static ReservationDto convToDto(ReservationEntity reservationEntity) {
        ReservationDto reservationDto = new ReservationDto();
        reservationDto.setId(reservationEntity.getId());
        reservationDto.setCustomer(CustomerMapping.convToDto(reservationEntity.getCustomer()));
        reservationDto.setRoomId(reservationEntity.getId());
        reservationDto.setStartDate(reservationEntity.getCheckInDate());
        reservationDto.setEndDate(reservationEntity.getCheckOutDate());
        return reservationDto;
    }

    public static ReservationEntity convToEntity(ReservationDto reservationDto) {
        ReservationEntity reservationEntity = new ReservationEntity();
        reservationEntity.setId(reservationDto.getId());
        reservationEntity.setRoomId(reservationDto.getRoomId());
        reservationEntity.setCheckOutDate(reservationDto.getEndDate());
        reservationEntity.setCheckInDate(reservationDto.getStartDate());
        reservationEntity.setCustomer(CustomerMapping.convToEntity(reservationDto.getCustomer()));
        return reservationEntity;
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
}
