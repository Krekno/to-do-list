package com.todolist.backend.service;

import com.todolist.backend.model.dto.AuthRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<String> login(AuthRequest authRequest);
    ResponseEntity<String> register(AuthRequest authRequest);
}
