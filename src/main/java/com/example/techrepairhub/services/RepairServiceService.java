package com.example.techrepairhub.services;

import com.example.techrepairhub.models.RepairService;
import com.example.techrepairhub.repositories.RepairServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairServiceService {

    private final RepairServiceRepository repairServiceRepository;

    public RepairServiceService(RepairServiceRepository repairServiceRepository) {
        this.repairServiceRepository = repairServiceRepository;
    }

    public List<RepairService> findAll() {
        return repairServiceRepository.findAll();
    }

    public RepairService save(RepairService repairService) {
        return repairServiceRepository.save(repairService);
    }

    public void deleteById(Long id) {
        repairServiceRepository.deleteById(id);
    }
}
