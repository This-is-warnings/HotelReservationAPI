package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.Room;
import com.example.hotelreservationapi.mappers.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomMapper roomMapper;

    @Override
    public void add(Room room) {
        roomMapper.create(room);
    }

    @Override
    public void delete(int id) {
        roomMapper.delete(id);
    }

    @Override
    public ArrayList<Room> getAllRooms() {
        return roomMapper.read();
    }

    @Override
    public void update(Room room) {
        roomMapper.update(room);
    }
}
