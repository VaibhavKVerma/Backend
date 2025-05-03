package com.backend.backend.auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    @GetMapping(value = "/ping")
    public ResponseEntity<String> ping() {
        System.out.println("ping");
        return new ResponseEntity<>("PONG", HttpStatus.OK);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<String> register() {
        System.out.println("register");
        return new ResponseEntity<>("PONG", HttpStatus.OK);
    }

    @PostMapping(value = "/login")
    public ResponseEntity<String> login() {
        System.out.println("login");
        return new ResponseEntity<>("PONG", HttpStatus.OK);
    }
}
