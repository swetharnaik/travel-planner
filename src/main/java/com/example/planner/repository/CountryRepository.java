package com.example.planner.repository;

import com.example.planner.models.Country;
import com.example.planner.models.CountryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, CountryKey> {
}
