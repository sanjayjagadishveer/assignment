package com.dlithe.assignment.serviceImp;


import com.dlithe.assignment.entity.Student;
import com.dlithe.assignment.repository.StudentDAO;
import com.dlithe.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentDAO studentDAO;


    @Override
    public String registerStudentDetails(Student student) {
        Student details = new Student();
        details.setStudentName(student.getStudentName());
        details.setFatherName(student.getFatherName());
        details.setContactNumber(student.getContactNumber());
        details.setEmailId(student.getEmailId());
        details.setCourseStream(student.getCourseStream());
        studentDAO.save(details);
        return "Data added successfully";
    }

    @Override
    public String updateStudentDetails(Student student) {
        Student updatedData = new Student();
        updatedData.setStudentName(student.getStudentName());
        updatedData.setFatherName(student.getFatherName());
        updatedData.setContactNumber(student.getContactNumber());
        updatedData.setEmailId(student.getEmailId());
        updatedData.setCourseStream(student.getCourseStream());


        studentDAO.save(updatedData);
        return "Data updated successfully";
    }


}
