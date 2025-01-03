package com.example.techrepairhub.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "repair_service_id")
    private RepairService repairService;

    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Technician technician;
}
