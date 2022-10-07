package com.example.planner.service;

import com.example.planner.models.Country;
import com.example.planner.models.CountryKey;
import com.example.planner.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public Country getCountryById(Long id) {
        Optional<Country> optionalCountry = countryRepository.findById(new CountryKey(id, "DE"));
        return optionalCountry.orElseGet(Country::new);
    }

    public Country getCountryByName(String name) {
        return countryRepository.findByName(name);
    }
}
