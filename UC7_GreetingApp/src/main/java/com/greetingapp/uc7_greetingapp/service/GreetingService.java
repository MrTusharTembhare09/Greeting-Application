package com.greetingapp.uc7_greetingapp.service;

import com.greetingapp.uc7_greetingapp.model.Greeting;
import com.greetingapp.uc7_greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class GreetingService {
    @Autowired
    private GreetingRepository greetingRepository;

    // Creating a new greeting
    public Greeting createGreeting(String message) {
        return greetingRepository.save(new Greeting(null, message));
    }

    // Retrieving a greeting by ID
    public Greeting getGreeting(Long id) {
        return greetingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting not found with ID: " + id));
    }

    // Updating a greeting message
    public Greeting updateGreeting(Long id, String newMessage) {
        Optional<Greeting> optionalGreeting = greetingRepository.findById(id);
        if (optionalGreeting.isPresent()) {
            Greeting greeting = optionalGreeting.get();
            greeting.setMessage(newMessage);
            return greetingRepository.save(greeting);
        } else {
            throw new RuntimeException("Greeting not found with ID: " + id);
        }
    }

    // Deleting a greeting
    public void deleteGreeting(Long id) {
        greetingRepository.deleteById(id);
    }
}
