package com.example.hotelreservationapi.mappers;

import com.example.hotelreservationapi.domains.AddService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddServiceMapper {

    List<AddService> gerAllAddServices();

    List<AddService> getAllAddServicesByRoomId(int roomId);

    void addServiceToRoom(int serviceId, int roomId);

    void deleteAllRoomsService(int roomId);

    void deleteServiceFromRoom(int roomId, int serviceId);
}
