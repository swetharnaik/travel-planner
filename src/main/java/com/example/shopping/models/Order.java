package com.example.shopping.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedSubgraph;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "shop_order")
@NoArgsConstructor
@Getter
@Setter
@NamedEntityGraph(name = "order-items-customer",
attributeNodes = {@NamedAttributeNode("items"),
        @NamedAttributeNode(value = "customer", subgraph = "customer-address")},
subgraphs = @NamedSubgraph(name = "customer-address",
        attributeNodes = @NamedAttributeNode("address")))
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private Price price;

    @ManyToMany
    @JoinTable(name = "order_item",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> items;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @JoinColumn(name = "customer_email", referencedColumnName = "email_address")
    private Customer customer;
}
