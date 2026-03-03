package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversationController {

    @GetMapping("/message")
    public String conversation(@RequestParam String message){
        return message + "it is nice to meet you!";
    }

}
