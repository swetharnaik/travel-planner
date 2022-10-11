package com.example.shopping.service;

import com.example.shopping.dto.CustomerDto;
import com.example.shopping.mapper.CustomerMapper;
import com.example.shopping.models.Customer;
import com.example.shopping.repository.CustomerRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private CustomerMapper customerMapper = Mappers.getMapper(CustomerMapper.class);
    @Autowired
    CustomerRepository customerRepository;

    public CustomerDto getCustomerById(Long id) {
        Optional<Customer> optionalCustomer = customerRepository.findCustomerById(id);
        if(optionalCustomer.isPresent())
            return customerMapper.mapCustomerToDto(optionalCustomer.get());
        else
            return CustomerDto.builder().build();
    }

    public List<CustomerDto> getCustomerByName(String name) {
        String[] splitNames = StringUtils.split(name, " ");
        String firstName = splitNames[0];
        String lastName = Arrays.stream(splitNames).skip(1).collect(Collectors.joining(" "));
        return customerMapper.mapCustomerListToDtoList(
                customerRepository.findByFirstNameAndLastName(firstName, lastName));
    }

    public CustomerDto addCustomer(CustomerDto customerDto) {
        Customer customer = customerMapper.mapDtoToCustomer(customerDto);
        return customerMapper.mapCustomerToDto(customerRepository.save(customer));
    }
}
