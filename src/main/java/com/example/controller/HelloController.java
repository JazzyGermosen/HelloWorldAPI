package com.example.controller;

import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final MessageRepository repository;

    public HelloController(MessageRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World API is running!";
    }

    @GetMapping("/message")
    public String getMessage() {
        List<Message> messages = repository.findAll();
        return messages.isEmpty() ? "No message found" : messages.get(0).getText();
    }
}
