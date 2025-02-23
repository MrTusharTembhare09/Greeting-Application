package com.greetingapp.uc5_greetingapp.service;

import com.greetingapp.uc5_greetingapp.model.Greeting;
import com.greetingapp.uc5_greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    // Creating a new Greeting message
    public Greeting createGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }

    // Finding a Greeting message by ID
    public Optional<Greeting> getGreetingById(Long id) {
        return greetingRepository.findById(id);
    }
}

