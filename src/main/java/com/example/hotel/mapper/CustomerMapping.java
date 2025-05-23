package com.example.hotel.mapper;

import hotel.model.CustomerDto;
import com.example.hotel.entity.CustomerEntity;
import com.example.hotel.entity.ReservationEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerMapping {

    public static CustomerDto convToDto(CustomerEntity customerEntity) {
        List<Integer> reservationIds = customerEntity.getReservationEntity().stream()
                .map(ReservationEntity::getId)
                .toList();

        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customerEntity.getId());
        customerDto.setFirstName(customerEntity.getName());
        customerDto.setLastName(customerEntity.getSurname());
        customerDto.setEmail(customerEntity.getEmail());
        customerDto.setReservationIds(reservationIds);
        return customerDto;
    }

    public static CustomerEntity convToEntity(CustomerDto customerDto) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setId(customerDto.getId());
        customerEntity.setName(customerDto.getFirstName());
        customerEntity.setSurname(customerDto.getEmail());

        // Conversione reservationIds → ReservationEntity (solo con ID)
        if (customerDto.getReservationIds() != null) {
            List<ReservationEntity> reservations = customerDto.getReservationIds().stream()
                    .map(id -> {
                        ReservationEntity reservation = new ReservationEntity();
                        reservation.setId(id);
                        reservation.setCustomer(customerEntity); // imposta il riferimento inverso
                        return reservation;
                    })
                    .collect(Collectors.toList());

            customerEntity.setReservationEntity(reservations);
        }

        return customerEntity;
    }

    public static List<CustomerEntity> listEntity(List<CustomerDto> listDto) {
        List<CustomerEntity> listEntity = new ArrayList<>();
        for (CustomerDto customerDto : listDto) {
            CustomerEntity customer = CustomerMapping.convToEntity(customerDto);
            listEntity.add(customer);
        }
        return listEntity;
    }

    public static List<CustomerDto> listDto(List<CustomerEntity> listEntity) {
        List<CustomerDto> listDto = new ArrayList<>();
        for (CustomerEntity customer : listEntity) {
            CustomerDto customerDto = CustomerMapping.convToDto(customer);
            listDto.add(customerDto);
        }
        return listDto;
    }
}
