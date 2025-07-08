package com.todolist.backend.service;

import com.todolist.backend.model.dto.LoginRequest;
import com.todolist.backend.model.dto.RegisterRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<String> login(LoginRequest loginRequest);
    ResponseEntity<String> register(RegisterRequest registerRequest);
}
