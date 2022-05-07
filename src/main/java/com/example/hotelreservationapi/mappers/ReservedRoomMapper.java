package com.example.hotelreservationapi.mappers;

import com.example.hotelreservationapi.domains.ReservedRoom;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ReservedRoomMapper {

    void create(ReservedRoom reservedRoom);

    void delete(int id);

    void deleteByRoomId(int roomId);

    void deleteByUserId(int userId);

    ArrayList<ReservedRoom> read();

    void updateStatus(int id, String status);

    ArrayList<ReservedRoom> readByStatus(String status);

    ArrayList<ReservedRoom> readByRoom(int roomId);

    ArrayList<ReservedRoom> readUserReservedRooms(int userId);

    ArrayList<ReservedRoom> readUserReservedRoomsByStatus(int userId, String status);

}
