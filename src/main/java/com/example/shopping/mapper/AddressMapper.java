package com.example.shopping.mapper;

import com.example.shopping.dto.AddressDto;
import com.example.shopping.models.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    AddressDto addressToDto(Address address);
    Address dtoToAddress(AddressDto addressDto);
}
