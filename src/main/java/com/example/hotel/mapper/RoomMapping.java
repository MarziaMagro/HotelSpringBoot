package com.example.hotel.mapper;

import com.example.hotel.entity.RoomEntity;
import com.example.hotel.entity.RoomType;
import hotel.model.RoomDtoInput;
import hotel.model.RoomDtoOutput;

import java.util.ArrayList;
import java.util.List;

public class RoomMapping {

    public static RoomDtoOutput convToDto(RoomEntity roomEntity) {
        RoomDtoOutput roomDto = new RoomDtoOutput();
        roomDto.setId(roomEntity.getId());
        roomDto.setRoomNumber(roomEntity.getRoomNumber());
        roomDto.setAvailable(roomEntity.getAvailability());
        roomDto.setRoomType(RoomMapping.toDtoEnum(roomEntity.getRoomType()));
        return roomDto;
    }

    public static RoomEntity convToEntity(RoomDtoInput roomDto) {
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setId(roomDto.getId());
        roomEntity.setRoomNumber(roomDto.getRoomNumber());
        roomEntity.setAvailability(roomDto.getAvailable());
        roomEntity.setRoomType(RoomMapping.toEntityEnum(roomDto.getRoomType()));
        return roomEntity;
    }

    public static List<RoomEntity> listEntity(List<RoomDtoInput> listDto) {
        List<RoomEntity> listEntity = new ArrayList<>();
        for (RoomDtoInput roomDto : listDto) {
            RoomEntity room = RoomMapping.convToEntity(roomDto);
            listEntity.add(room);
        }
        return listEntity;
    }

    public static List<RoomDtoOutput> listDto(List<RoomEntity> listEntity) {
        List<RoomDtoOutput> listDto = new ArrayList<>();
        for (RoomEntity roomEntity : listEntity) {
            RoomDtoOutput roomDto = RoomMapping.convToDto(roomEntity);
            listDto.add(roomDto);
        }
        return listDto;
    }

    public static RoomDtoOutput.RoomTypeEnum toDtoEnum(RoomType roomtype) {
        if (roomtype == null) return null;
        return RoomDtoOutput.RoomTypeEnum.valueOf(roomtype.name());
    }

    public static RoomType toEntityEnum(RoomDtoInput.RoomTypeEnum dtoEnum) {
        if (dtoEnum == null) return null;
        return RoomType.valueOf(dtoEnum.name());
    }
}
