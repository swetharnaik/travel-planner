package com.example.shopping.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@EqualsAndHashCode
@AllArgsConstructor
//@Embeddable
@NoArgsConstructor
@Getter
@Setter
public class CustomerKey implements Serializable {

    /**
     * Generated value doesn't work with embedded id
     * reference- https://thorben-janssen.com/composite-primary-keys-sequence/
     **/
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "email_address")
    private String emailAddress;

}
