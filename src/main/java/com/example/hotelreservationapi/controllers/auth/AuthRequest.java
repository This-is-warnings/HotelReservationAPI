package com.example.hotelreservationapi.controllers.auth;

import lombok.Data;

@Data
public class AuthRequest {

    private String login;

    private String password;

}
