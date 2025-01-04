package com.example.techrepairhub.services;

import com.example.techrepairhub.dto.TechnicianDTO;
import com.example.techrepairhub.mappers.TechnicianMapper;
import com.example.techrepairhub.models.Technician;
import com.example.techrepairhub.repositories.TechnicianRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TechnicianService {

    private final TechnicianRepository technicianRepository;
    private final TechnicianMapper technicianMapper;

    public List<TechnicianDTO> findAll() {
        return technicianRepository.findAll().stream()
                .map(technicianMapper::toDto)
                .collect(Collectors.toList());
    }

    public TechnicianDTO save(TechnicianDTO technicianDTO) {
        Technician technician = technicianMapper.toEntity(technicianDTO);
        Technician savedTechnician = technicianRepository.save(technician);
        return technicianMapper.toDto(savedTechnician);
    }

    public void deleteById(Long id) {
        technicianRepository.deleteById(id);
    }
}
