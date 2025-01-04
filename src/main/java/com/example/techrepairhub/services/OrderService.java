package com.example.techrepairhub.services;

import com.example.techrepairhub.dto.OrderDTO;
import com.example.techrepairhub.mappers.OrderMapper;
import com.example.techrepairhub.models.Order;
import com.example.techrepairhub.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public List<OrderDTO> findAll() {
        return orderRepository.findAll().stream()
                .map(orderMapper::toDto)
                .collect(Collectors.toList());
    }

    public OrderDTO save(OrderDTO orderDTO) {
        Order order = orderMapper.toEntity(orderDTO);
        Order savedOrder = orderRepository.save(order);
        return orderMapper.toDto(savedOrder);
    }

    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }
}
