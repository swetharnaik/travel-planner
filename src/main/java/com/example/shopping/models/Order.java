package com.example.shopping.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "capital_city")
@NoArgsConstructor
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Long itemAmount;

    @Column
    private String itemName;

    @Column
    private String itemDescription;

    @Column
    private String sellerName;

    @OneToMany
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private List<Item> items;

}
