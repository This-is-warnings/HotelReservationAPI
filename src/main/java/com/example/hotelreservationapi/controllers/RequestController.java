package com.example.hotelreservationapi.controllers;

import com.example.hotelreservationapi.domains.Request;
import com.example.hotelreservationapi.services.RequestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RequestController {

    @Autowired
    RequestService requestService;

    @GetMapping("requests")
    @ApiOperation("get all requests")
    ArrayList<Request> getAllRequests(){
        return requestService.getAllRequests();
    }

}
