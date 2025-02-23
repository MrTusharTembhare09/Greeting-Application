package com.example.helloworldapp.controller;

import com.example.helloworldapp.model.Greeting;
import com.example.helloworldapp.model.User;
import com.example.helloworldapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // GET Request - Default Greeting
    @GetMapping
    public Greeting getDefaultGreeting() {
        return new Greeting("Hello World!");
    }

    // GET Request - Greeting with Query Parameters
    @GetMapping("/query")
    public Greeting getGreetingByQuery(@RequestParam(required = false) String firstName,
                                       @RequestParam(required = false) String lastName) {
        return greetingService.getGreeting(new User(firstName, lastName));
    }

    // GET Request - Greeting with Path Variables
    @GetMapping("/param/{firstName}/{lastName}")
    public Greeting getGreetingByPath(@PathVariable String firstName, @PathVariable String lastName) {
        return greetingService.getGreeting(new User(firstName, lastName));
    }

    // POST Request - Greeting with JSON Body
    @PostMapping("/post")
    public Greeting getGreetingByPost(@RequestBody User user) {
        return greetingService.getGreeting(user);
    }
}

