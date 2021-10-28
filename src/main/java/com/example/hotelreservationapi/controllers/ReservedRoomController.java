package com.example.hotelreservationapi.controllers;

import com.example.hotelreservationapi.domains.ReservedRoom;
import com.example.hotelreservationapi.services.ReservedRoomService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("reservedRoom")
public class ReservedRoomController {

    @Autowired
    ReservedRoomService reservedRoomService;

    @GetMapping
    @ApiOperation("get all reserved rooms")
    ArrayList<ReservedRoom> getAllReservedRooms() {
        return reservedRoomService.getAllReservedRooms();
    }

    @PostMapping
    @ApiOperation("add reserved room")
    void addReservedRoom(@RequestBody ReservedRoom reservedRoom) {
        reservedRoomService.addReservedRoom(reservedRoom);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("delete reserved room")
    void deleteReservedRoom(@PathVariable int id) {
        reservedRoomService.deleteReservedRoom(id);
    }

    @PutMapping("/{id}")
    @ApiOperation("update reserved room status")
    void updateReservedRoomStatus(@PathVariable int id, @RequestBody String status) {
        reservedRoomService.updateReservedRoomStatus(id, status);
    }

    @PostMapping("/status")
    @ApiOperation("get reserved roooms by status")
    ArrayList<ReservedRoom> getReservedRoomByStatus(@RequestBody String status) {
        return reservedRoomService.getByStatus(status);
    }

    @GetMapping("/users/{id}")
    @ApiOperation("get user reserved rooms")
    ArrayList<ReservedRoom> getUserReservedRooms(@PathVariable int id) {
        return reservedRoomService.getUserReservedRooms(id);
    }

}
