package com.example.shopping.dto;

import com.example.shopping.models.Item;
import lombok.Data;

/**
 * A DTO for the {@link Item} entity
 */
@Data
public class ItemDto {
    private Long id;
    private String itemName;
    private String itemDescription;
    private String sellerName;
}