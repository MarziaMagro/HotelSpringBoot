package com.example.hotel.Mapper;

import com.example.hotel.model.CustomerDto;
import com.example.hotel.Entity.CustomerEntity;
import com.example.hotel.Entity.ReservationEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerMapping {

    public static CustomerDto convToDto(CustomerEntity customer) {
        List<Integer> reservationIds = customer.getReservationEntity().stream()
                .map(ReservationEntity::getId)
                .toList();

        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setFirstName(customer.getName());
        customerDto.setLastName(customer.getSurname());
        customerDto.setEmail(customer.getEmail());
        customerDto.setReservationIds(reservationIds);
        return customerDto;
    }

    public static CustomerEntity convToEntity(CustomerDto customerDto) {
        CustomerEntity customer = new CustomerEntity();
        customer.setId(customerDto.getId());
        customer.setName(customerDto.getFirstName());
        customer.setSurname(customerDto.getEmail());

        // Conversione reservationIds → ReservationEntity (solo con ID)
        if (customerDto.getReservationIds() != null) {
            List<ReservationEntity> reservations = customerDto.getReservationIds().stream()
                    .map(id -> {
                        ReservationEntity reservation = new ReservationEntity();
                        reservation.setId(id);
                        reservation.setCustomer(customer); // imposta il riferimento inverso
                        return reservation;
                    })
                    .collect(Collectors.toList());

            customer.setReservationEntity(reservations);
        }

        return customer;
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
