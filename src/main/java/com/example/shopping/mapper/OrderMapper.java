package com.example.shopping.mapper;

import com.example.shopping.dto.OrderDto;
import com.example.shopping.models.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(uses = {CustomerMapper.class, AddressMapper.class})
public interface OrderMapper {

    List<OrderDto> mapOrderToDtoList(List<Order> orders);

    @Mapping(source = "id", target = "id")
    OrderDto mapOrderToDto(Order order);
}
