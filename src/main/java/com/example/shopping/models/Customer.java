package com.example.shopping.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
public class Customer {
    @EmbeddedId
    private CustomerKey customerKey;

    @Column(length = 25)
    @Length(min = 3, max = 4)   //hibernate specific annotation
    private String firstName;

    @Column(length = 25)        //restrict column length in table
    @Size(min = 3, max = 4)     //bean validation annotation
    private String lastName;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
}
