package com.dlithe.assignment.controller;


import com.dlithe.assignment.entity.Student;
import com.dlithe.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("register-student-details")
    public String registerStudentDetails(@RequestBody Student student) {
        return studentService.registerStudentDetails(student);
    }

    @PutMapping("update-student-details")
    public  String updateStudentDetails(@RequestBody Student student)
    {
        return  studentService.updateStudentDetails(student);
    }
}
