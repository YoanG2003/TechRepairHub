package com.example.techrepairhub.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RepairService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer duration;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderService> orderServices = new ArrayList<>();

    // Getters and Setters
}
