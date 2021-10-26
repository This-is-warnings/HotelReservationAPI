package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.ReservedRoom;

import java.util.ArrayList;

public interface ReservedRoomService {

    ArrayList<ReservedRoom> getAllReservedRooms();

    void addReservedRoom(ReservedRoom reservedRoom);

    void deleteReservedRoom(int id);

}
