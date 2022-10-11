package com.example.shopping.dto;

import com.example.shopping.models.Address;
import lombok.Builder;
import lombok.Data;

/**
 * A DTO for the {@link Address} entity
 */
@Data
@Builder
public class AddressDto {
    private String streetName;
    private String district;
    private String pinCode;
    private String country;

}