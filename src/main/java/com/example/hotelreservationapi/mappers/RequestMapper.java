package com.example.hotelreservationapi.mappers;

import com.example.hotelreservationapi.domains.Request;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface RequestMapper {

    ArrayList<Request> read();

    Request readById(int id);

    ArrayList<Request> readUserRequests(int userId);

    void deleteRequest(int id);

    void deleteByUserId(int userId);

    void create(Request request);

    void updateStatus(int id, String newStatus);

    ArrayList<Request> readByStatus(String status);

    ArrayList<Request> readUserRequestsByStatus(int userId, String status);

}
