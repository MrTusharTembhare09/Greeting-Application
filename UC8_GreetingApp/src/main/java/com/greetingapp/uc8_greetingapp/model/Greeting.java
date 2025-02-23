package com.greetingapp.uc8_greetingapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "greetings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
}

