package com.example.hotel.mapper;

import com.example.hotel.entity.RoomEntity;
import com.example.hotel.entity.RoomType;
import hotel.model.RoomDto;

import java.util.ArrayList;
import java.util.List;
public class RoomMapping {

    public static RoomDto convToDto(RoomEntity room) {
        RoomDto roomDto = new RoomDto();
        roomDto.setId(room.getId());
        roomDto.setRoomNumber(room.getRoomNumber());
        roomDto.setAvailable(room.getAvailability());
        roomDto.setRoomType(RoomMapping.toDtoEnum(room.getRoomType()));
        return roomDto;
    }

    public static RoomEntity convToEntity(RoomDto roomDto) {
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setId(roomDto.getId());
        roomEntity.setRoomNumber(roomDto.getRoomNumber());
        roomEntity.setAvailability(roomDto.getAvailable());
        roomEntity.setRoomType(RoomMapping.toEntityEnum(roomDto.getRoomType()));
        return roomEntity;
    }

    public static List<RoomEntity> listEntity(List<RoomDto> listDto) {
        List<RoomEntity> listEntity = new ArrayList<>();
        for (RoomDto roomDto : listDto) {
           RoomEntity room = RoomMapping.convToEntity(roomDto);
           listEntity.add(room);
        }
        return listEntity;
    }

    public static List<RoomDto> listDto(List<RoomEntity> listEntity) {
        List<RoomDto> listDto = new ArrayList<>();
        for (RoomEntity roomEntity : listEntity) {
            RoomDto roomDto = RoomMapping.convToDto(roomEntity);
            listDto.add(roomDto);
        }
        return listDto;
    }

    public static RoomDto.RoomTypeEnum toDtoEnum(RoomType roomtype) {
        if (roomtype == null) return null;
        return RoomDto.RoomTypeEnum.valueOf(roomtype.name());
    }

    public static RoomType toEntityEnum(RoomDto.RoomTypeEnum dtoEnum) {
        if (dtoEnum == null) return null;
        return RoomType.valueOf(dtoEnum.name());
    }


}
