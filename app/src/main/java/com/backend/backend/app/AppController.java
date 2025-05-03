package com.backend.backend.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AppController {
    @GetMapping(value = "/healthCheck")
    public ResponseEntity<String> ping() {
        return new ResponseEntity<>("PONG", HttpStatus.OK);
    }
}
