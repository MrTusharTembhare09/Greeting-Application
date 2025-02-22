package com.example.helloworldapp.controller;

import com.example.helloworldapp.dto.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // 1️⃣ GET Request: Returns a greeting message
    @GetMapping
    public Greeting getGreeting() {
        return new Greeting("Hello from BridgeLabz!");
    }

    // 2️⃣ POST Request: Accepts a custom greeting message in the body
    @PostMapping
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        return new Greeting("Received: " + greeting.getMessage());
    }

    // 3️⃣ PUT Request: Updates the greeting message
    @PutMapping("/{name}")
    public Greeting putGreeting(@PathVariable String name) {
        return new Greeting("Updated Greeting: Hello, " + name + "!");
    }

    // 4️⃣ DELETE Request: Deletes a greeting message
    @DeleteMapping("/{name}")
    public Greeting deleteGreeting(@PathVariable String name) {
        return new Greeting("Deleted Greeting for " + name);
    }
}

