package com.example.shopping.service;

import com.example.shopping.dto.OrderDto;
import com.example.shopping.mapper.OrderMapper;
import com.example.shopping.models.Order;
import com.example.shopping.repository.OrderRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private OrderMapper orderMapper = Mappers.getMapper(OrderMapper.class);
    @Autowired
    OrderRepository orderRepository;

    public OrderDto getOrderById(Long id) {
        Optional<Order> orderOptional = orderRepository.findById(id);
        if(orderOptional.isPresent())
            return orderMapper.mapOrderToDto(orderOptional.get());
        else
            return new OrderDto();
    }

    public List<OrderDto> getOrdersFromItemSize(Long itemSize) {
        return orderMapper.mapOrderToDtoList(orderRepository.getOrdersFromItemSize(itemSize));
    }
}
