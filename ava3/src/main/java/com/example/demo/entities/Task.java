package com.example.demo.entities;

public class Task {
    private int id;
    private String description;

    public Task() {
        // serialização/desserialização JSON
    }

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
