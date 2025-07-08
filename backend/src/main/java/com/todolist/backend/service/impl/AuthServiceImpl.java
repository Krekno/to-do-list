package com.todolist.backend.service.impl;

import com.todolist.backend.config.CustomUserDetailsService;
import com.todolist.backend.config.JwtUtil;
import com.todolist.backend.model.dto.AuthRequest;
import com.todolist.backend.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final JwtUtil jwtUtil;
    private final CustomUserDetailsService userDetailsService;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;

    @Override
    public ResponseEntity<String> login(AuthRequest authRequest) {
        return null;
    }

    @Override
    public ResponseEntity<String> register(AuthRequest authRequest) {
        return null;
    }
}
