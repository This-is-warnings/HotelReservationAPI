package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.Role;
import com.example.hotelreservationapi.mappers.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    RoleMapper roleMapper;

    @Override
    public ArrayList<Role> getAllUserRoles(int userId) {
        return roleMapper.readAllUserRoles(userId);
    }

    @Override
    public ArrayList<Role> getAllRoles() {
        return roleMapper.read();
    }

    @Override
    public void addRoleToUser(int userId, int roleId) {
        roleMapper.addRoleToUser(userId, roleId);
    }

    @Override
    public void deleteRoleFromUser(int userId, int roleID) {
        roleMapper.deleteRoleFromUser(userId, roleID);
    }
}
