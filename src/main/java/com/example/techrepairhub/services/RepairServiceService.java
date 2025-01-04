package com.example.techrepairhub.services;

import com.example.techrepairhub.dto.RepairServiceDTO;
import com.example.techrepairhub.mappers.RepairServiceMapper;
import com.example.techrepairhub.models.RepairService;
import com.example.techrepairhub.repositories.RepairServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RepairServiceService {

    private final RepairServiceRepository repairServiceRepository;
    private final RepairServiceMapper repairServiceMapper;

    public List<RepairServiceDTO> findAll() {
        return repairServiceRepository.findAll().stream()
                .map(repairServiceMapper::toDto)
                .collect(Collectors.toList());
    }

    public RepairServiceDTO save(RepairServiceDTO repairServiceDTO) {
        RepairService repairService = repairServiceMapper.toEntity(repairServiceDTO);
        RepairService savedRepairService = repairServiceRepository.save(repairService);
        return repairServiceMapper.toDto(savedRepairService);
    }

    public void deleteById(Long id) {
        repairServiceRepository.deleteById(id);
    }
}
