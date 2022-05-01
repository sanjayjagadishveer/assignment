package com.dlithe.assignment.controller;

import com.dlithe.assignment.dto.CountryDetailsResponse;
import com.dlithe.assignment.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("fetch-country-id/{id}")
    public CountryDetailsResponse getCountryIdDetails(@PathVariable int id) {

        return countryService.getCountryIdDetails(id);
    }

    @GetMapping("fetch-country-name/{countryName}")

    public CountryDetailsResponse getCountryNameDetails(@PathVariable String countryName) {
        return countryService.getCountryNameDetails(countryName);
    }

    @GetMapping("fetch-capital-currency/{countryCapital}/{countryCurrency}")

    public CountryDetailsResponse getCapitalAndCurrencyDetails(@PathVariable String countryCapital, @PathVariable String countryCurrency) {
        return countryService.getCapitalAndCurrencyDetails(countryCapital, countryCurrency);
    }


}
