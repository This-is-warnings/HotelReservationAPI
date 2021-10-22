package com.example.hotelreservationapi.mappers;

import com.example.hotelreservationapi.domains.Request;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface RequestMapper {

    ArrayList<Request> read();

 /*   ArrayList<Request> readUserRequests(int userId);

    void deleteRequest(int requestId);

    void create(Request request);

    void updateConfirmed(int requestId, boolean isConfirmed);*/

}
