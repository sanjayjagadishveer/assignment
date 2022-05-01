package com.dlithe.assignment.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "student_details")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "contact_number")
    private int contactNumber;

    @Column(name = "course_stream")
    private String courseStream;


}
