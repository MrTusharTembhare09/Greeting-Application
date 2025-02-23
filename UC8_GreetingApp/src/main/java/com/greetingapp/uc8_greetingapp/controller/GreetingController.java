package com.greetingapp.uc8_greetingapp.controller;

import com.greetingapp.uc8_greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // Endpoint to delete a greeting
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteGreeting(@PathVariable Long id) {
        String response = greetingService.deleteGreeting(id);
        return ResponseEntity.ok(response);
    }
}

