package com.example.techrepairhub.services;

import com.example.techrepairhub.models.Technician;
import com.example.techrepairhub.repositories.TechnicianRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicianService {

    private final TechnicianRepository technicianRepository;

    public TechnicianService(TechnicianRepository technicianRepository) {
        this.technicianRepository = technicianRepository;
    }

    public List<Technician> findAll() {
        return technicianRepository.findAll();
    }

    public Technician save(Technician technician) {
        return technicianRepository.save(technician);
    }

    public void deleteById(Long id) {
        technicianRepository.deleteById(id);
    }
}
