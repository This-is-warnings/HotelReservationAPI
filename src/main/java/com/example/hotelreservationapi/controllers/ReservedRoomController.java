package com.example.hotelreservationapi.controllers;

import com.example.hotelreservationapi.domains.ReservedRoom;
import com.example.hotelreservationapi.services.ReservedRoomService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ReservedRoomController {

    @Autowired
    ReservedRoomService reservedRoomService;

    @GetMapping("reservedRoom")
    @ApiOperation("get all reserved rooms")
    ArrayList<ReservedRoom> getAllReservedRooms(){
        return reservedRoomService.getAllReservedRooms();
    }

    @PostMapping("reservedRoom")
    @ApiOperation("add reserved room")
    void addReservedRoom(@RequestBody ReservedRoom reservedRoom){
        reservedRoomService.addReservedRoom(reservedRoom);
    }

    @DeleteMapping("reservedRoom/{id}")
    @ApiOperation("delete reserved room")
    void deleteReservedRoom(@PathVariable int id){
        reservedRoomService.deleteReservedRoom(id);
    }

}
