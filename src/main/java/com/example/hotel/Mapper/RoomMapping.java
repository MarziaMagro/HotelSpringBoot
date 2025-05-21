//package com.example.hotel.Mapper;
//
//import com.example.hotel.Entity.Customer;
//import com.example.hotel.Entity.Room;
//import com.example.hotel.Entity.RoomType;
//import com.example.hotel.model.RoomDto;
//import com.example.hotel.model.RoomType;
//import java.util.ArrayList;
//import java.util.List;
//
//public class RoomMapping {
//
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
//    public static RoomDto.RoomTypeEnum toDtoEnum(RoomType roomtype) {
//        if (roomtype == null) return null;
//        return RoomDto.RoomTypeEnum.valueOf(roomtype.name());
//    }
//
//    public static Room toEntityEnum(IceCreamDto.IceCreamTasteEnum dtoEnum) {
//        if (dtoEnum == null) return null;
//        return IceCreamTaste.valueOf(dtoEnum.name());
//    }
//
//}
