package com.example.hotelreservationapi.controllers;

import com.example.hotelreservationapi.domains.Request;
import com.example.hotelreservationapi.services.RequestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("requests")
@CrossOrigin(origins = "http://localhost:4200")
public class RequestController {

    @Autowired
    RequestService requestService;

    @GetMapping()
    @ApiOperation("get all requests")
    ArrayList<Request> getAllRequests() {
        return requestService.getAllRequests();
    }

    @GetMapping("/{id}")
    @ApiOperation("get request by id")
    Request getById(@PathVariable(name = "id") int id) {
        return requestService.getById(id);
    }

    @GetMapping("/user/{id}")
    @ApiOperation("get all user requests")
    ArrayList<Request> getUserRequests(@PathVariable(name = "id") int userId) {
        return requestService.getUserRequests(userId);
    }

    @PostMapping()
    @ApiOperation("add request")
    void addRequest(@RequestBody Request request) {
        requestService.add(request);
    }

    @PutMapping("/{id}")
    @ApiOperation("update request status")
    void updateRequestStatus(@PathVariable(name = "id") int id, @RequestBody String newStatus) {
        requestService.updateStatus(id, newStatus);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("delete request")
    void deleteRequest(@PathVariable(name = "id") int id) {
        requestService.delete(id);
    }

    @PostMapping("/status")
    @ApiOperation("get requests by status")
    ArrayList<Request> getRequestsByStatus(@RequestBody String status) {
        return requestService.getByStatus(status);
    }

    @PostMapping("/users/{id}/status")
    @ApiOperation("get user requests by status")
    ArrayList<Request> getUserRequestsByStatus(@PathVariable(name = "id") int id, @RequestBody String status){
        System.out.println(id + status);
        return requestService.getUserRequestsByStatus(id, status);
    }
}
