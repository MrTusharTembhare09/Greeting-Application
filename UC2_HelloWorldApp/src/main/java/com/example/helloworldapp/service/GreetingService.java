package com.example.helloworldapp.service;

import com.example.helloworldapp.dto.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    // Method to return a simple greeting message
    public Greeting getGreeting() {
        return new Greeting("Hello World");
    }
}

