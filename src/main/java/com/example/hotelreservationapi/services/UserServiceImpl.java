package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.User;
import com.example.hotelreservationapi.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public void createUser(User user) {
        userMapper.create(user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println(user);
        userMapper.update(user);
    }

    @Override
    public void deleteUser(int id) {
        userMapper.delete(id);
    }

    @Override
    public ArrayList<User> getAllUsers() {
        return userMapper.readAll();
    }

    @Override
    public User getUserById(int id) {
        return userMapper.readById(id);
    }
}
