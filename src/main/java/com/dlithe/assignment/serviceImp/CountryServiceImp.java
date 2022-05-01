package com.dlithe.assignment.serviceImp;

import com.dlithe.assignment.dto.CountryDetailsResponse;
import com.dlithe.assignment.dto.States;
import com.dlithe.assignment.entity.Country;
import com.dlithe.assignment.repository.CountryDAO;
import com.dlithe.assignment.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImp implements CountryService {
    @Autowired
    private CountryDAO countryDAO;

    @Override
    public CountryDetailsResponse getCountryIdDetails(int id) {
        CountryDetailsResponse countryDetailsResponse = new CountryDetailsResponse();

        Optional<Country> countryDetails = countryDAO.findById(id);

        Country country = countryDetails.get();

        countryDetailsResponse.setCountryId(country.getCountryId());
        countryDetailsResponse.setCountryName(country.getCountryName());
        countryDetailsResponse.setCountryCapital(country.getCountryCapital());
        countryDetailsResponse.setCountryCurrency(country.getCountryCurrency());
        countryDetailsResponse.setCountryPopulation(country.getCountryPopulation());

        List<States> statesList = new ArrayList<>();

        States stateOne = new States();
        stateOne.setStateName("Karnataka");
        stateOne.setStateLanguage("kannada");
        stateOne.setStateFestival("ugadi");
        statesList.add(stateOne);

        States stateTwo = new States();
        stateTwo.setStateName("Tamil nadu");
        stateTwo.setStateLanguage("Tamil");
        stateTwo.setStateFestival("thai pongal");
        statesList.add(stateTwo);

        States stateThree = new States();
        stateThree.setStateName("Kerala");
        stateThree.setStateLanguage("malayalam");
        stateThree.setStateFestival("onam");
        statesList.add(stateThree);

        States stateFour = new States();
        stateFour.setStateName("Maharashtra");
        stateFour.setStateLanguage("marathi");
        stateFour.setStateFestival("gudi padwa");
        statesList.add(stateFour);

        countryDetailsResponse.setStatesInCountry(statesList);


        return countryDetailsResponse;
    }

    @Override
    public CountryDetailsResponse getCountryNameDetails(String countryName) {
        CountryDetailsResponse countryDetailsResponse = new CountryDetailsResponse();

        Country country = countryDAO.findByName(countryName);

        countryDetailsResponse.setCountryId(country.getCountryId());
        countryDetailsResponse.setCountryName(country.getCountryName());
        countryDetailsResponse.setCountryCapital(country.getCountryCapital());
        countryDetailsResponse.setCountryCurrency(country.getCountryCurrency());
        countryDetailsResponse.setCountryPopulation(country.getCountryPopulation());

        return countryDetailsResponse;
    }

    @Override
    public CountryDetailsResponse getCapitalAndCurrencyDetails(String countryCapital, String countryCurrency) {

        CountryDetailsResponse countryDetailsResponse = new CountryDetailsResponse();

        Country country = countryDAO.findByCapitalAndCurrency(countryCapital, countryCurrency);

        countryDetailsResponse.setCountryId(country.getCountryId());
        countryDetailsResponse.setCountryName(country.getCountryName());
        countryDetailsResponse.setCountryCapital(country.getCountryCapital());
        countryDetailsResponse.setCountryCurrency(country.getCountryCurrency());
        countryDetailsResponse.setCountryPopulation(country.getCountryPopulation());
        return countryDetailsResponse;
    }
}
