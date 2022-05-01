package com.dlithe.assignment.service;

import com.dlithe.assignment.dto.CountryDetailsResponse;
import org.springframework.stereotype.Component;

@Component
public interface CountryService {

    CountryDetailsResponse getCountryIdDetails(int id);

    CountryDetailsResponse getCountryNameDetails(String countryName);

    CountryDetailsResponse getCapitalAndCurrencyDetails(String countryCapital, String countryCurrency);

}
