package com.dlithe.assignment.repository;

import com.dlithe.assignment.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDAO extends JpaRepository<Country, Integer> {

    @Query(value = "select * from country_details where country_name=?1", nativeQuery = true)
    Country findByName(String countryName);

    @Query(value = "select * from country_details where country_capital=?1 and country_currency=?2", nativeQuery = true)
    Country findByCapitalAndCurrency(String countryCapital, String countryCurrency);
}
