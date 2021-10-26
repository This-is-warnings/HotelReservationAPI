package com.example.hotelreservationapi.mappers;

import com.example.hotelreservationapi.domains.Room;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface RoomMapper {

    void create(Room room);

    void delete(int id);

    ArrayList<Room> read();

    void update(Room room);

    Room readById(int id);

}
