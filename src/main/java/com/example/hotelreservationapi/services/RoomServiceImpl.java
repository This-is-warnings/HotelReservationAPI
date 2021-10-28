package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.Request;
import com.example.hotelreservationapi.domains.ReservedRoom;
import com.example.hotelreservationapi.domains.Room;
import com.example.hotelreservationapi.mappers.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomMapper roomMapper;

    @Autowired
    ReservedRoomService reservedRoomService;

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

    @Override
    public Room getRoomById(int id) {
        return roomMapper.readById(id);
    }

    @Override
    public ArrayList<Room> getSuitableRoom(Request request) {
        ArrayList<Room> rooms = roomMapper.readSuitableRooms(request.getNumberOfRooms(), request.getRoomClass());
        ArrayList<Room> suitableRooms = new ArrayList<>();
        for (Room room :
                rooms) {
            if (isFreeRoom(request.getStartDate(), request.getEndDate(), reservedRoomService.getByRoom(room.getId()))) {
                suitableRooms.add(room);
            }
        }
        return suitableRooms;
    }

    private boolean isFreeRoom(Date requestStartDate, Date requestEndDate, ArrayList<ReservedRoom> reservedRooms) {

        for (ReservedRoom reservedRoom :
                reservedRooms) {
            if (requestStartDate.compareTo(reservedRoom.getEndDate()) < 0 && requestStartDate.compareTo(reservedRoom.getStartDate()) > 0)
                return false;
            if (requestEndDate.compareTo(reservedRoom.getEndDate()) < 0 && requestEndDate.compareTo(reservedRoom.getStartDate()) > 0)
                return false;
            if (requestEndDate.compareTo(reservedRoom.getEndDate()) > 0 && requestStartDate.compareTo(reservedRoom.getStartDate()) < 0)
                return false;
        }

        return true;
    }
}
