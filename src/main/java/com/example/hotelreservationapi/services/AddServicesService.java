package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.AddService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AddServicesService {
    void updateRoomServices(List<AddService> services, int roomId);

    List<AddService> gerAllAddServices();

    List<AddService> getAllAddServicesByRoomId(int roomId);

    void addServicesToRoom(List<AddService> services, int roomId);

    void deleteAllRoomsService(int roomId);

    void deleteServiceFromRoom(int roomId, int serviceId);
}
