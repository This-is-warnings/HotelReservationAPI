package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.User;

import java.util.ArrayList;

public interface UserService {

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    ArrayList<User> getAllUsers();

    User getUserById(int id);

}
