package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.ReservedRoom;
import com.example.hotelreservationapi.mappers.ReservedRoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReservedRoomServiceImpl implements ReservedRoomService{

    @Autowired
    ReservedRoomMapper reservedRoomMapper;

    @Override
    public ArrayList<ReservedRoom> getAllReservedRooms() {
        return reservedRoomMapper.read();
    }

    @Override
    public void addReservedRoom(ReservedRoom reservedRoom){
        reservedRoomMapper.create(reservedRoom);
    }

    @Override
    public void deleteReservedRoom(int id) {
        reservedRoomMapper.delete(id);
    }

    @Override
    public void updateReservedRoomStatus(int id, String status) {
        reservedRoomMapper.updateStatus(id, status);
    }

    @Override
    public ArrayList<ReservedRoom> getByStatus(String status) {
        return reservedRoomMapper.readByStatus(status);
    }

    @Override
    public ArrayList<ReservedRoom> getByRoom(int roomId) {
        return reservedRoomMapper.readByRoom(roomId);
    }

    @Override
    public ArrayList<ReservedRoom> getUserReservedRooms(int userId) {
        return reservedRoomMapper.readUserReservedRooms(userId);
    }

}
