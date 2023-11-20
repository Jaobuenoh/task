package com.example.demo.controller;

import com.example.demo.entities.Task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/tasks")
public class TaskManagerApplication {

    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApplication.class, args);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    @PostMapping
    public Task addTask(@RequestBody Task newTask) {
        newTask.setId(nextId++);
        tasks.add(newTask);
        return newTask;
    }
  // test development
}

