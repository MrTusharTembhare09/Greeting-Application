package com.greetingapp.uc4_greetingapp.service;

import com.greetingapp.uc4_greetingapp.model.Greeting;
import com.greetingapp.uc4_greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    // Method to save Greeting message
    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }
}

