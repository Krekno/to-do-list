package com.todolist.backend.service;

import com.todolist.backend.model.Task;
import com.todolist.backend.model.dto.TaskDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TaskService {

    ResponseEntity<List<Task>> getAllTasks();
    Object getTask(Long id);
    ResponseEntity<Task> addTask(TaskDto task);
    ResponseEntity<Task> updateTask(Long id, TaskDto task);
    ResponseEntity<Void> deleteTask(Long id);
}
