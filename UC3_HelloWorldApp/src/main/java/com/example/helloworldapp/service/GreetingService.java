package com.example.helloworldapp.service;

import com.example.helloworldapp.model.Greeting;
import com.example.helloworldapp.model.User;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public Greeting getGreeting(User user) {
        String message;

        if (user.getFirstName() != null && user.getLastName() != null) {
            message = "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
        } else if (user.getFirstName() != null) {
            message = "Hello " + user.getFirstName() + "!";
        } else if (user.getLastName() != null) {
            message = "Hello " + user.getLastName() + "!";
        } else {
            message = "Hello World!";
        }
        return new Greeting(message);
    }
}

