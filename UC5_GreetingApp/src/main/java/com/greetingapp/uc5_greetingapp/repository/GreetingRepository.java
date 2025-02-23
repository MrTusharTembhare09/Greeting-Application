package com.greetingapp.uc5_greetingapp.repository;

import com.greetingapp.uc5_greetingapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}

