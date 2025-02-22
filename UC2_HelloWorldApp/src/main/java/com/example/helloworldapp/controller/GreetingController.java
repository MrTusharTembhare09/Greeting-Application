package com.example.helloworldapp.controller;

import com.example.helloworldapp.dto.Greeting;
import com.example.helloworldapp.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor-based dependency injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // GET Request - Get a simple greeting message
    @GetMapping
    public Greeting getGreeting() {
        return greetingService.getGreeting();
    }
}

