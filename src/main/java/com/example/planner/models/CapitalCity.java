package com.example.planner.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "capital_city")
@NoArgsConstructor
@Getter
@Setter
public class CapitalCity {

    @Id
    private Long id;

    @Column
    private String name;

}
