package com.example.shopping.dto;

import com.example.shopping.models.Customer;
import lombok.Data;

/**
 * A DTO for the {@link Customer} entity
 */
@Data
public class CustomerDto {
    private String firstName;
    private String lastName;
    private AddressDto address;
    private String emailAddress;
}