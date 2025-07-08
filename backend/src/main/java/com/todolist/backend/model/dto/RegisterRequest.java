package com.todolist.backend.model.dto;

import lombok.Data;

@Data
public class RegisterRequest {

    private String email;
    private String username;
    private String password;
}
