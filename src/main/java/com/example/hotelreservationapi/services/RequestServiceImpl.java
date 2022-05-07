package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.Request;
import com.example.hotelreservationapi.mappers.RequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    RequestMapper requestMapper;

    @Override
    public ArrayList<Request> getAllRequests() {
        return requestMapper.read();
    }

    @Override
    public ArrayList<Request> getUserRequests(int userId) {
        return requestMapper.readUserRequests(userId);
    }

    @Override
    public void delete(int id) {
        requestMapper.deleteRequest(id);
    }

    @Override
    public void deleteByUserId(int userId) {
        requestMapper.deleteByUserId(userId);
    }

    @Override
    public void add(Request request) {
        requestMapper.create(request);
    }

    @Override
    public void updateStatus(int id, String newStatus) {
        requestMapper.updateStatus(id, newStatus);
    }

    @Override
    public ArrayList<Request> getByStatus(String status) {
        return requestMapper.readByStatus(status);
    }

    @Override
    public ArrayList<Request> getUserRequestsByStatus(int userId, String status) {
        return requestMapper.readUserRequestsByStatus(userId, status);
    }

    @Override
    public Request getById(int id) {
        return requestMapper.readById(id);
    }


}
