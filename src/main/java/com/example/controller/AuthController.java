package com.example.controller;


import com.example.configure.jwt.JwtProvider;
import com.example.entity.UserEntity;
import com.example.request.AuthRequest;
import com.example.request.RegistrationRequest;
import com.example.response.AuthResponse;
import com.example.response.TokenResponse;
import com.example.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@CrossOrigin
@RestController
public class AuthController {

    private final UserService userService;

    private final JwtProvider jwtProvider;

    public AuthController(UserService userService, JwtProvider jwtProvider) {
        this.userService = userService;
        this.jwtProvider = jwtProvider;
    }

    @PostMapping("/register")
    public UserEntity registerUser(@RequestBody @Valid RegistrationRequest registrationRequest) {
        UserEntity user = new UserEntity();
        user.setPassword(registrationRequest.getPassword());
        user.setLogin(registrationRequest.getLogin());
        return userService.saveUser(user);
    }

    @PostMapping("/auth")
    public @ResponseBody
    AuthResponse auth(@RequestBody AuthRequest request) {
        UserEntity userEntity = userService.findByLoginAndPassword(request.getLogin(), request.getPassword());
        String token = jwtProvider.generateToken(userEntity.getLogin());
        return new AuthResponse(token);
    }

    @GetMapping("auth/token")
    public @ResponseBody
    TokenResponse token(HttpServletRequest request) {
        if (!jwtProvider.validateToken(request.getHeader("Authorization"))) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new TokenResponse(true);
    }
}