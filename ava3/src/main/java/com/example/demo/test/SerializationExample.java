package com.example.demo.test;

import com.example.demo.entities.Task;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationExample {
    public static void main(String[] args) {
        // Objeto a ser serializado
        Task task = new Task(1, "Example task");

        // Objeto ObjectMapper do Jackson
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Serialização do objeto para JSON
            String json = objectMapper.writeValueAsString(task);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}