package com.example.shopping.repository;

import com.example.shopping.models.Customer;
import com.example.shopping.models.CustomerKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, CustomerKey> {

    Optional<Customer> findByCustomerKey_Id(Long id);

    Customer findByCustomerKey_EmailAddress(String emailAddress);
    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
}
