//package com.example.hotel.Mapper;
//
//import com.example.hotel.Entity.Reservation;
//import com.example.hotel.model.ReservationDto;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReservationMapping {
//    public static ReservationDto convToDto(Reservation reservation) {
//        ReservationDto reservationDto = new ReservationDto();
//        reservationDto.setId(reservation.getId());
//        reservationDto.setStartDate(reservation.getCheckInDate());
//        reservationDto.setEndDate(reservation.getCheckOutDate());
//        return reservationDto;
//    }
//
//    public static Reservation convToEntity(ReservationDto reservationDto) {
//      Reservation reservation = new Reservation();
//
//        return reservation;
//    }
//
//    public static List<Reservation> listEntity(List<ReservationDto> listDto) {
//        List<Reservation> listEntity = new ArrayList<>();
//        for (ReservationDto reservationDto : listDto) {
//            Reservation reservation = ReservationMapping.convToEntity(reservationDto);
//            listEntity.add(reservation);
//        }
//        return listEntity;
//    }
//
//    public static List<ReservationDto> listDto(List<Reservation> listEntity) {
//        List<ReservationDto> listDto = new ArrayList<>();
//        for (Reservation reservation : listEntity) {
//            ReservationDto reservationDto = ReservationMapping.convToDto(reservation);
//            listDto.add(reservationDto);
//        }
//        return listDto;
//    }
//}
