package com.example.techrepairhub.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

@Entity
public class Technician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String specialization;

    private String skillLevel;

    @ManyToMany(mappedBy = "technicians")
    private List<Order> orders = new ArrayList<>();

    // Getters and Setters
}
