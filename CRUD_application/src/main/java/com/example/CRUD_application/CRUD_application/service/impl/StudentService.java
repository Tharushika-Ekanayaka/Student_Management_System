package com.example.CRUD_application.CRUD_application.service.impl;
import com.example.CRUD_application.CRUD_application.model.Student;
import java.util.List;


public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudent();
    Student getStudentById(long id);
    Student updateStudent(Student student,long id);
    void deleteStudent(long id);

    List<Student> getStudentByYearsOfExperience(int yearsOfEnrollment);
    String findDepartmentById(long id);
    String deleteStudentByYearsOfEnrollment(int yearsOfEnrollment);
}
