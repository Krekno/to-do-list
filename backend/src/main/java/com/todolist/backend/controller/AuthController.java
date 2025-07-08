package com.todolist.backend.controller;

import com.todolist.backend.model.dto.LoginRequest;
import com.todolist.backend.model.dto.RegisterRequest;
import com.todolist.backend.service.impl.AuthServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthServiceImpl authService;

    @RequestMapping("/login")
    public ResponseEntity<String> login(LoginRequest request) {
        return authService.login(request);
    }

    @RequestMapping("/register")
    public ResponseEntity<String> register(RegisterRequest request) {
        return authService.register(request);
    }
}
