package com.example.planner.service;

import com.example.planner.models.Country;
import com.example.planner.models.CountryKey;
import com.example.planner.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public Country getCountry(Long id) {
        return countryRepository.findById(new CountryKey(id, "DE")).get();
    }
}
