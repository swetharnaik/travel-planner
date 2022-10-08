package com.example.shopping.service;

import com.example.shopping.models.Customer;
import com.example.shopping.repository.CustomerRepository;
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

    public Customer getCustomeryById(Long id) {
        Optional<Customer> optionalCountry = customerRepository.findByCustomerKey_Id(id);
        return optionalCountry.orElseGet(Customer::new);
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
