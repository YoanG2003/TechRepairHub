package com.example.techrepairhub.mappers;

import com.example.techrepairhub.dto.TechnicianDTO;
import com.example.techrepairhub.models.Technician;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TechnicianMapper {
    TechnicianDTO toDto(Technician technician);
    Technician toEntity(TechnicianDTO technicianDTO);
}
