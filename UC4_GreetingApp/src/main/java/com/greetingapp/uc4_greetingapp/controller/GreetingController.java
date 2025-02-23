package com.greetingapp.uc4_greetingapp.controller;

import com.greetingapp.uc4_greetingapp.model.Greeting;
import com.greetingapp.uc4_greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // POST API to save a greeting message
    @PostMapping("/save")
    public Greeting saveGreeting(@RequestBody Greeting greeting) {
        return greetingService.saveGreeting(greeting.getMessage());
    }
}

