package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.Request;

import java.util.ArrayList;

public interface RequestService {

    ArrayList<Request> getAllRequests();

    Request getById(int id);

    ArrayList<Request> getUserRequests(int userId);

    void delete(int id);

    void add(Request request);

    void updateStatus(int id, String newStatus);

    ArrayList<Request> getByStatus(String status);
}
