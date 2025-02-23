package com.greetingapp.uc6_greetingapp.service;

import com.greetingapp.uc6_greetingapp.model.Greeting;
import com.greetingapp.uc6_greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    // Create a new Greeting message
    public Greeting createGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }

    // Find Greeting by ID
    public Optional<Greeting> getGreetingById(Long id) {
        return greetingRepository.findById(id);
    }

    // List all Greetings
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }
}

