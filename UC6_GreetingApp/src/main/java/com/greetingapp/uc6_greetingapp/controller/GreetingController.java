package com.greetingapp.uc6_greetingapp.controller;

import com.greetingapp.uc6_greetingapp.model.Greeting;
import com.greetingapp.uc6_greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // POST Request - Create Greeting
    @PostMapping
    public Greeting createGreeting(@RequestBody String message) {
        return greetingService.createGreeting(message);
    }

    // GET Request - Find Greeting by ID
    @GetMapping("/{id}")
    public Optional<Greeting> getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }

    // GET Request - List all Greetings
    @GetMapping
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }
}

