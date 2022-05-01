package com.dlithe.assignment.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "state_details")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "state_id")
    private int stateId;

    @Column(name = "state_name")
    private String stateName;

    @Column(name = "state_capital")
    private String stateCapital;

    @Column(name = "state_population")
    private String statePopulation;
}
