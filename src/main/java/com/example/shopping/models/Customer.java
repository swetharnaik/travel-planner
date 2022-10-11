package com.example.shopping.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.validator.constraints.Length;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@Entity
@IdClass(CustomerId.class)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Id
    @Column(name = "email_address")
    private String emailAddress;

//    @EmbeddedId
//    private CustomerKey customerKey;

    @Column(length = 25)
    @Length(min = 3, max = 4)   //hibernate specific annotation
    private String firstName;

    @Column(length = 25)        //restrict column length in table
    @Size(min = 3, max = 4)     //bean validation annotation
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)   //(orphanRemoval = true)
    @Fetch(FetchMode.SUBSELECT)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @JoinColumn(name = "customer_email", referencedColumnName = "email_address")
    private List<Address> address;
}
