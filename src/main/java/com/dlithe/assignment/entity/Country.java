package com.dlithe.assignment.entity;

import com.dlithe.assignment.dto.States;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@Setter
@ToString
@Entity
@Table(name = "country_details")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "country_id")
    private int countryId;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "country_capital")
    private String countryCapital;

    @Column(name = "country_currency")
    private String countryCurrency;

    @Column(name = "country_population")
    private String countryPopulation;


}
