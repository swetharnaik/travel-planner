package com.example.planner.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="countries")
public class Country implements Serializable {
    @EmbeddedId
    private CountryKey countryKey;

    @Column(length = 25)
    @Length(min = 3, max = 4)
    private String name;

    @Column(length = 25)
    @Size(min = 3, max = 4)
    private String capital;
}
