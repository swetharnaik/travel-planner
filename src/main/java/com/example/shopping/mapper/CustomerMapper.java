package com.example.shopping.mapper;

import com.example.shopping.dto.CustomerDto;
import com.example.shopping.models.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = AddressMapper.class)
public interface CustomerMapper {

    @Mapping(target="emailAddress", source="customerKey.emailAddress")
    @Mapping(target="addresses", source="address")
    CustomerDto customerToDto(Customer customer);

}
