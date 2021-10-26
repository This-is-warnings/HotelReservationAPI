package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.Role;
import com.example.hotelreservationapi.domains.User;
import com.example.hotelreservationapi.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RoleService roleService;

    @Override
    public void createUser(User user) {
        int userId = userMapper.create(user);
        for (Role role:
             user.getRoles()) {
            roleService.addRoleToUser(userId, role.getId());
        }
    }

    @Override
    public void updateUser(User user) {
        User userNow = getUserById(user.getId());

        if (!(userNow.getRoles().size() == user.getRoles().size() && // if roles edit
                userNow.getRoles().containsAll(user.getRoles()))) {
            roleService.deleteAllUserRoles(userNow.getId());
            for (Role role : user.getRoles()) {
                roleService.addRoleToUser(userNow.getId(), role.getId());
            }
        }

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
