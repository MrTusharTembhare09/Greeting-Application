package com.greetingapp.uc7_greetingapp.service;

import com.greetingapp.uc7_greetingapp.model.Greeting;
import com.greetingapp.uc7_greetingapp.repository.GreetingRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class GreetingServiceTest {
    @Mock
    private GreetingRepository greetingRepository;

    @InjectMocks
    private GreetingService greetingService;

    @Test
    void testUpdateGreeting() {
        Greeting greeting = new Greeting(1L, "Hello, World!");
        when(greetingRepository.findById(1L)).thenReturn(Optional.of(greeting));
        when(greetingRepository.save(any(Greeting.class))).thenReturn(greeting);

        Greeting updatedGreeting = greetingService.updateGreeting(1L, "Hello, Tushar!");

        assertNotNull(updatedGreeting);
        assertEquals("Hello, Tushar!", updatedGreeting.getMessage());
        verify(greetingRepository, times(1)).findById(1L);
        verify(greetingRepository, times(1)).save(greeting);
    }
}

