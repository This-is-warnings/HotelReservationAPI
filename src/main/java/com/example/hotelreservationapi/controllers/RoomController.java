package com.example.hotelreservationapi.controllers;

import com.example.hotelreservationapi.domains.Request;
import com.example.hotelreservationapi.domains.Room;
import com.example.hotelreservationapi.services.RoomService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("rooms")
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping
    @ApiOperation("get all rooms")
    ArrayList<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    @PostMapping
    @ApiOperation("add room")
    void addRoom(@RequestBody Room room) {
        roomService.add(room);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("delete room")
    void deleteRoom(@PathVariable(name = "id") int id) {
        roomService.delete(id);
    }

    @PutMapping
    @ApiOperation("update room")
    void updateRoom(@RequestBody Room room) {
        roomService.update(room);
    }

    @GetMapping("/{id}")
    @ApiOperation("get room by id")
    Room getRoomById(@PathVariable int id) {
        return roomService.getRoomById(id);
    }

    @PostMapping("/suitable")
    @ApiOperation("get suitable rooms")
    ArrayList<Room> getSuitableRooms(@RequestBody Request request) {
        return roomService.getSuitableRoom(request);
    }

}
