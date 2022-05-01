package com.dlithe.assignment.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CountryDetailsResponse {

    private int countryId;
    private String countryName;
    private String countryCapital;
    private String countryCurrency;
    private String countryPopulation;
    private List<States> statesInCountry;
}
