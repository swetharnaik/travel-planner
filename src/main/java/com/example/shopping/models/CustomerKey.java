package com.example.shopping.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@EqualsAndHashCode
@AllArgsConstructor
@Embeddable
@NoArgsConstructor
@Getter
@Setter
public class CustomerKey implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email_address")
    private String emailAddress;

}
