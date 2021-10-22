package com.example.hotelreservationapi.mappers;

import com.example.hotelreservationapi.domains.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface UserMapper {

    void create(@Param("user") User user);

    void update(@Param("user") User user);

    void delete(int id);

    User readById(int id);

    ArrayList<User> readAll();
}
