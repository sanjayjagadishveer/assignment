package com.dlithe.assignment.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StudentDetailsRequest {

    private String studentName;
    private String fatherName;
    private String emailId;
    private int contactNumber;
    private String courseStream;

}
