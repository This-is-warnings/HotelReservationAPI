package com.example.hotelreservationapi.mappers;

import com.example.hotelreservationapi.domains.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface RoleMapper {

    ArrayList<Role> readAllUserRoles(int userId);

    void addRoleToUser(int userId, int roleId);

    void deleteRoleFromUser(int userId, int roleID);

    ArrayList<Role> read();

    void deleteAllUserRoles(int userId);

}
