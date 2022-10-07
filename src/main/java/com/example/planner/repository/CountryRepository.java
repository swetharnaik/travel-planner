package com.example.planner.repository;

import com.example.planner.models.Country;
import com.example.planner.models.CountryKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, CountryKey> {

    Country findByName(String name);
}
