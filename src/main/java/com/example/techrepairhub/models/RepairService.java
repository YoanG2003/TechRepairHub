package com.example.techrepairhub.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class RepairService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    @OneToMany(mappedBy = "repairService")
    private List<Order> orders;
}
