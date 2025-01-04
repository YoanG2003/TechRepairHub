package com.example.techrepairhub.controllers;

import com.example.techrepairhub.dto.TechnicianDTO;
import com.example.techrepairhub.services.TechnicianService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/technicians")
@RequiredArgsConstructor
public class TechnicianController {

    private final TechnicianService technicianService;

    @GetMapping
    public ResponseEntity<List<TechnicianDTO>> getAllTechnicians() {
        return ResponseEntity.ok(technicianService.findAll());
    }

    @PostMapping
    public ResponseEntity<TechnicianDTO> createTechnician(@RequestBody TechnicianDTO technicianDTO) {
        return ResponseEntity.ok(technicianService.save(technicianDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTechnician(@PathVariable Long id) {
        technicianService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
