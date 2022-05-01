package com.dlithe.assignment.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StateDetailsResponse {
    private int stateId;
    private String stateName;
    private String stateCapital;
    private String statePopulation;

}
