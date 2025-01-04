package com.example.techrepairhub.mappers;

import com.example.techrepairhub.dto.RepairServiceDTO;
import com.example.techrepairhub.models.RepairService;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RepairServiceMapper {
    RepairServiceDTO toDto(RepairService repairService);
    RepairService toEntity(RepairServiceDTO repairServiceDTO);
}
