package com.example.shopping.repository;

import com.example.shopping.models.Customer;
import com.example.shopping.models.CustomerId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, CustomerId> {

    Optional<Customer> findCustomerById(Long id);

    boolean existsCustomerById(Long id);

    /**
     * repository method name for embeddable composite key
     */
    //Customer findByCustomerKey_EmailAddress(String emailAddress);
    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
}
