package com.example.shopping.dto;

import com.example.shopping.models.Customer;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * A DTO for the {@link Customer} entity
 */
@Data
@Builder
public class CustomerDto {
    private String id;
    private String firstName;
    private String lastName;
    private List<AddressDto> addresses;
    private String emailAddress;
}