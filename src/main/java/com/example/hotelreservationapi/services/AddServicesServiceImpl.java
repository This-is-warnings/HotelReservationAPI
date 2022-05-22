package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.AddService;
import com.example.hotelreservationapi.mappers.AddServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddServicesServiceImpl implements AddServicesService {

    @Autowired
    AddServiceMapper addServiceMapper;

    @Override
    public void updateRoomServices(List<AddService> services, int roomId) {
        deleteAllRoomsService(roomId);
        addServicesToRoom(services, roomId);

    }

    @Override
    public List<AddService> gerAllAddServices() {
        return addServiceMapper.gerAllAddServices();
    }

    @Override
    public List<AddService> getAllAddServicesByRoomId(int roomId) {
        return addServiceMapper.getAllAddServicesByRoomId(roomId);
    }

    @Override
    public void addServicesToRoom(List<AddService> services, int roomId) {
        services.forEach(el -> {
            addServiceMapper.addServiceToRoom(el.getId(), roomId);
        });
    }

    @Override
    public void deleteAllRoomsService(int roomId) {
        addServiceMapper.deleteAllRoomsService(roomId);
    }

    @Override
    public void deleteServiceFromRoom(int roomId, int serviceId) {
        addServiceMapper.deleteServiceFromRoom(roomId, serviceId);
    }
}
