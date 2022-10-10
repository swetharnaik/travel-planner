package com.example.shopping.dto;

import com.example.shopping.models.Order;
import lombok.Data;

import java.util.List;

/**
 * A DTO for the {@link Order} entity
 */
@Data
public class OrderDto {
    private Long id;
    private PriceDto price;
    private List<ItemDto> items;
    private CustomerDto customer;
}