package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.Request;
import com.example.hotelreservationapi.mappers.RequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RequestServiceImpl implements RequestService{

    @Autowired
    RequestMapper requestMapper;

    @Override
    public ArrayList<Request> getAllRequests() {
        return requestMapper.read();
    }
}
