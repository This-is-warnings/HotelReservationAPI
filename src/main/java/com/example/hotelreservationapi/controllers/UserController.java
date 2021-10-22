package com.example.hotelreservationapi.controllers;

import com.example.hotelreservationapi.domains.User;
import com.example.hotelreservationapi.services.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController()
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ApiOperation("Get all user")
    ArrayList<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    @ApiOperation("Get user by id")
    User getUser(@PathVariable(name = "id") int id){
        return userService.getUserById(id);
    }

    @PostMapping
    @ApiOperation("Add user")
    void addUser(@RequestBody User user){
        userService.createUser(user);
    }

    @PutMapping
    @ApiOperation("Update user")
    void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete user")
    void deleteUser(@PathVariable(name = "id") int id){
        userService.deleteUser(id);
    }


}
