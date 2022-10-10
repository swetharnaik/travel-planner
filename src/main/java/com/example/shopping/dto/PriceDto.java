package com.example.shopping.dto;

import com.example.shopping.models.Price;
import lombok.Data;

/**
 * A DTO for the {@link Price} entity
 */
@Data
public class PriceDto {
    private Long amount;
    private String currency;
}