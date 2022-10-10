package com.example.shopping.controller;

import com.example.shopping.dto.CustomerDto;
import com.example.shopping.models.Customer;
import com.example.shopping.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/{id}")
    CustomerDto getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping
    List<CustomerDto> getCustomerByName(@RequestParam String name) {
        return customerService.getCustomerByName(name);
    }

    @PostMapping
    Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
}
