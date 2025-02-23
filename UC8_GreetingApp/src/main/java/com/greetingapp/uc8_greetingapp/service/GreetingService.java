package com.greetingapp.uc8_greetingapp.service;

import com.greetingapp.uc8_greetingapp.exception.GreetingNotFoundException;
import com.greetingapp.uc8_greetingapp.model.Greeting;
import com.greetingapp.uc8_greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    // Deleting a Greeting by ID
    public String deleteGreeting(Long id) {
        Optional<Greeting> greeting = greetingRepository.findById(id);
        if (greeting.isPresent()) {
            greetingRepository.deleteById(id);
            return "Greeting deleted successfully!";
        } else {
            throw new GreetingNotFoundException("Greeting with ID " + id + " not found.");
        }
    }
}

