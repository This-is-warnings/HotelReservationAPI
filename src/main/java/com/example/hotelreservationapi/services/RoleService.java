package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.Role;

import java.util.ArrayList;

public interface RoleService {

    ArrayList<Role> getAllUserRoles(int userId);

    ArrayList<Role> getAllRoles();

    void addRoleToUser(int userId, int roleId);

    void deleteRoleFromUser(int userId, int roleID);

}
