package com.example.hotel.Mapper;

import com.example.hotel.Entity.RoomEntity;
import com.example.hotel.Entity.RoomType;
import com.example.room.model.RoomDto;

public class RoomMapping {

//    public static RoomDto convToDto(Room room) {
//        RoomDto roomDto = new RoomDto();
//        roomDto.setId(room.getId());
//        roomDto.setRoomNumber(room.getRoomNumber());
//        roomDto.setAvailable(room.getAvailability());
//        roomDto.setType(room.getRoomType());
//        return roomDto;
//    }
//
//    public static Customer convToEntity(CustomerDto customerDto) {
//        Customer customer = new Customer();
//        customer.setId(customerDto.getId());
//        customer.setName(customerDto.getFirstName());
//        customer.setSurname(customerDto.getEmail());
//        return customer;
//    }
//
//    public static List<Customer> listEntity(List<CustomerDto> listDto) {
//        List<Customer> listEntity = new ArrayList<>();
//        for (CustomerDto customerDto : listDto) {
//            Customer customer = CustomerMapping.convToEntity(customerDto);
//            listEntity.add(customer);
//        }
//        return listEntity;
//    }
//
//    public static List<CustomerDto> listDto(List<Customer> listEntity) {
//        List<CustomerDto> listDto = new ArrayList<>();
//        for (Customer customer : listEntity) {
//            CustomerDto customerDto = CustomerMapping.convToDto(customer);
//            listDto.add(customerDto);
//        }
//        return listDto;
//    }
//
//
    public static RoomDto.RoomTypeEnum toDtoEnum(RoomType roomtype) {
        if (roomtype == null) return null;
        return RoomDto.RoomTypeEnum.valueOf(roomtype.name());
    }

    public static RoomType toEntityEnum(RoomDto.RoomTypeEnum dtoEnum) {
        if (dtoEnum == null) return null;
        return RoomType.valueOf(dtoEnum.name());
    }

}
