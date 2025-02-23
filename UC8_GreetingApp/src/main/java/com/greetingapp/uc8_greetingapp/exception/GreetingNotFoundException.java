package com.greetingapp.uc8_greetingapp.exception;

public class GreetingNotFoundException extends RuntimeException {
    public GreetingNotFoundException(String message) {
        super(message);
    }
}

