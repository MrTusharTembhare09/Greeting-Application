package com.greetingapp.uc6_greetingapp.repository;

import com.greetingapp.uc6_greetingapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}

