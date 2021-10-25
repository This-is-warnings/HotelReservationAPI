package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.Room;

import java.util.ArrayList;

public interface RoomService {

    void add(Room room);

    void delete(int id);

    ArrayList<Room> getAllRooms();

    void update(Room room);

}
