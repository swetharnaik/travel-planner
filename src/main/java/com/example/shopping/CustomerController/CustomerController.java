package com.example.shopping.CustomerController;

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
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/{id}")
    Customer getCountryById(@PathVariable Long id) {
        return customerService.getCustomeryById(id);
    }

    @GetMapping
    List<Customer> getCountryByName(@RequestParam String name) {
        return customerService.getCustomerByName(name);
    }

    @PostMapping
    Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
}
