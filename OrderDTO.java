package com.example.techrepairhub.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDTO {
    private Long id;
    private Long repairServiceId;
    private Long technicianId;
    private String status;
    private LocalDateTime createdAt;
}
