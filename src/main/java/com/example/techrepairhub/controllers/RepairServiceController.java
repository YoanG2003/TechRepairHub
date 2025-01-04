package com.example.techrepairhub.controllers;

import com.example.techrepairhub.dto.RepairServiceDTO;
import com.example.techrepairhub.services.RepairServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
@RequiredArgsConstructor
public class RepairServiceController {

    private final RepairServiceService repairServiceService;

    @GetMapping
    public ResponseEntity<List<RepairServiceDTO>> getAllServices() {
        return ResponseEntity.ok(repairServiceService.findAll());
    }

    @PostMapping
    public ResponseEntity<RepairServiceDTO> createService(@RequestBody RepairServiceDTO repairServiceDTO) {
        return ResponseEntity.ok(repairServiceService.save(repairServiceDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteService(@PathVariable Long id) {
        repairServiceService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
