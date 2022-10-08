package com.example.shopping.dto;

import com.example.shopping.models.Customer;
import lombok.Data;

import java.util.List;

/**
 * A DTO for the {@link Customer} entity
 */
@Data
public class CustomerDto {
    private String firstName;
    private String lastName;
    private List<AddressDto> addresses;
    private String emailAddress;
}