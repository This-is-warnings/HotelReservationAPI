package com.example.hotelreservationapi.controllers;

import com.example.hotelreservationapi.config.jwt.JwtProvider;
import com.example.hotelreservationapi.controllers.auth.AuthRequest;
import com.example.hotelreservationapi.controllers.auth.AuthResponse;
import com.example.hotelreservationapi.domains.User;
import com.example.hotelreservationapi.services.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtProvider jwtProvider;

    @PostMapping("/auth")
    @ApiOperation("Авторизация пользователя")
    public AuthResponse login(@RequestBody AuthRequest request, HttpServletResponse response) throws IOException {
        User userEntity = userService.checkAuth(request.getLogin(), request.getPassword());
        if (userEntity == null) {
            response.sendError(401);
            return null;
        }
        String token = jwtProvider.generateToken(userEntity);
        return new AuthResponse(token);
    }
}
