package com.todolist.backend.service;

import com.todolist.backend.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTask(Long id);
    Task addTask(Task task);
    Task updateTask(Long id, Task task);
    Task deleteTask(Long id);
}
