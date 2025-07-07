package com.todolist.backend.service.impl;

import com.todolist.backend.model.dto.TaskDto;
import com.todolist.backend.model.Task;
import com.todolist.backend.repository.TaskRepository;
import com.todolist.backend.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> list = taskRepository.findAll();
        return list.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(list);
    }

    @Override
    public ResponseEntity<Task> getTask(Long id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Task> addTask(TaskDto task) {
        Task savedTask = new Task();
        savedTask.setCategory(task.getCategory());
        savedTask.setContent(task.getContent());
        savedTask.setCompleted(false);
        return ResponseEntity.ok(savedTask);
    }

    @Override
    public ResponseEntity<Task> updateTask(Long id, TaskDto task) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            Task existingTask = optionalTask.get();

            existingTask.setCompleted(task.isCompleted());
            existingTask.setCategory(task.getCategory());
            existingTask.setContent(task.getContent());

            taskRepository.save(existingTask);
            return ResponseEntity.ok(existingTask);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<Void> deleteTask(Long id) {
        if (taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
