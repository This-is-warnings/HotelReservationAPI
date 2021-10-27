package com.example.hotelreservationapi.mappers;

import com.example.hotelreservationapi.domains.ReservedRoom;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ReservedRoomMapper {

    void create(ReservedRoom reservedRoom);

    void delete(int id);

    ArrayList<ReservedRoom> read();

    void updateStatus(int id, String status);

}
