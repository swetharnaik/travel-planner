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

    @Autowired
    CustomerRepository customerRepository;

    public CustomerDto getCustomerById(Long id) {
        CustomerMapper customerMapper = Mappers.getMapper(CustomerMapper.class);
        Optional<Customer> optionalCustomer = customerRepository.findByCustomerKey_Id(id);
        if(optionalCustomer.isPresent())
            return customerMapper.customerToDto(optionalCustomer.get());
        else
            return new CustomerDto();
    }

    public List<Customer> getCustomerByName(String name) {
        String[] splitNames = StringUtils.split(name, " ");
        String firstName = splitNames[0];
        String lastName = Arrays.stream(splitNames).skip(1).collect(Collectors.joining(" "));
        return customerRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
