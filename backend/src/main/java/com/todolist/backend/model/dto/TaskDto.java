package com.todolist.backend.model.dto;

import com.todolist.backend.model.Category;
import lombok.Data;

@Data
public class TaskDto {
    private Category category;
    private String content;
    private boolean isCompleted;
}
