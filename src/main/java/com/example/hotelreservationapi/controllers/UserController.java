package com.example.hotelreservationapi.controllers;

import com.example.hotelreservationapi.domains.Card;
import com.example.hotelreservationapi.domains.User;
import com.example.hotelreservationapi.services.CardService;
import com.example.hotelreservationapi.services.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController()
@RequestMapping("users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private CardService cardService;

    @GetMapping
    @ApiOperation("Get all user")
    ArrayList<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    @ApiOperation("Get user by id")
    User getUser(@PathVariable(name = "id") int id) {
        return userService.getUserById(id);
    }

    @PostMapping
    @ApiOperation("Add user")
    void addUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @PutMapping
    @ApiOperation("Update user")
    void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete user")
    void deleteUser(@PathVariable(name = "id") int id) {
        userService.deleteUser(id);
    }

    @GetMapping("/{id}/cards")
    @ApiOperation("Get user cards")
    ArrayList<Card> getUserCards(@PathVariable(name = "id") int id) {
        return cardService.getUserCards(id);
    }

    @PostMapping("/{id}/cards")
    @ApiOperation("Add card to user")
    void addCard(@PathVariable(name = "id") int id, @RequestBody String number) {
        cardService.createCard(id, number);
    }

    @PutMapping("/{id}/cards")
    @ApiOperation("update card balance")
    void updateCardBalance(@PathVariable(name = "id") int id, @RequestBody float balance) {
        cardService.updateBalance(id, balance);
    }

    @DeleteMapping("/{id}/cards")
    @ApiOperation("delete card")
    void deleteCard(@PathVariable("id") int id) {
        cardService.deleteCard(id);
    }

    @GetMapping("/cards/{id}")
    @ApiOperation("get card by id")
    Card getCardById(@PathVariable int id) {
        return cardService.getCardById(id);
    }
}
