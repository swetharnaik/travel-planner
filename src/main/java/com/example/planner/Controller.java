package com.example.planner;

import com.example.planner.models.Country;
import com.example.planner.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    CountryService countryService;

    @GetMapping("/countries/{id}")
    Country getCountry(@PathVariable Long id) {
        return countryService.getCountry(id);
    }
}
