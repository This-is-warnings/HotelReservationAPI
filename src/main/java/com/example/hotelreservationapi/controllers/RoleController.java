package com.example.hotelreservationapi.controllers;

import com.example.hotelreservationapi.domains.Role;
import com.example.hotelreservationapi.services.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("roles")
@CrossOrigin(origins = "http://localhost:4200")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping
    @ApiOperation("get all roles")
    ArrayList<Role> getAllURoles() {
        return roleService.getAllRoles();
    }

}
