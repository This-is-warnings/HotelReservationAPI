package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.ReservedRoom;

import java.util.ArrayList;

public interface ReservedRoomService {

    ArrayList<ReservedRoom> getAllReservedRooms();

    void addReservedRoom(ReservedRoom reservedRoom);

    void deleteReservedRoom(int id);

    void deleteReservedRoomByRoomId(int roomId);

    void deleteReservedRoomByUserId(int userId);

    void updateReservedRoomStatus(int id, String status);

    ArrayList<ReservedRoom> getByStatus(String status);

    ArrayList<ReservedRoom> getByRoom(int roomId);

    ArrayList<ReservedRoom> getUserReservedRooms(int userId);

    ArrayList<ReservedRoom> getUserReservedRoomsByStatus(int userId, String status);

}
