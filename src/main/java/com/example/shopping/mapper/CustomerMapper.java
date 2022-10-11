package com.example.shopping.mapper;

import com.example.shopping.dto.CustomerDto;
import com.example.shopping.models.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(uses = AddressMapper.class)
public interface CustomerMapper {

    List<CustomerDto> mapCustomerListToDtoList(List<Customer> customers);

    @Mapping(target = "addresses", source = "address")
    CustomerDto mapCustomerToDto(Customer customer);

    @Mapping(source = "addresses", target = "address")
    Customer mapDtoToCustomer(CustomerDto customerDto);

}
