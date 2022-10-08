package com.example.shopping.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Price {

    @Column
    private Long amount;

    @Column
    private String currency;
}
