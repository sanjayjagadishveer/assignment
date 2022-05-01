package com.dlithe.assignment.service;

import com.dlithe.assignment.dto.StudentDetailsRequest;
import com.dlithe.assignment.entity.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentService {


    String registerStudentDetails(Student student);


    String updateStudentDetails(Student student);
}
