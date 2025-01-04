package com.example.techrepairhub.mappers;

import com.example.techrepairhub.dto.OrderDTO;
import com.example.techrepairhub.models.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    @Mappings({
            @Mapping(source = "repairService.id", target = "repairServiceId"),
            @Mapping(source = "technician.id", target = "technicianId")
    })
    OrderDTO toDto(Order order);

    @Mappings({
            @Mapping(source = "repairServiceId", target = "repairService.id"),
            @Mapping(source = "technicianId", target = "technician.id")
    })
    Order toEntity(OrderDTO orderDTO);
}
