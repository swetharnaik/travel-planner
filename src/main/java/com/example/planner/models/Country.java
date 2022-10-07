package com.example.planner.models;

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
public class Country {
    @EmbeddedId
    private CountryKey countryKey;

    @Column(length = 25)
    @Length(min = 3, max = 4)
    private String name;

    @Column(length = 25)
    @Size(min = 3, max = 4)
    private String capital;

    @OneToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private CapitalCity capitalCity;
}
