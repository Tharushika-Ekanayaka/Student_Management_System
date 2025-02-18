package com.example.CRUD_application.CRUD_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CRUD_application.CRUD_application.model.Student;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByYearsOfEnrollment(int years);
   @Query("SELECT department FROM Student WHERE id = ?1")
    String findDepartmentById(long id);
    @Modifying
    @Query("DELETE FROM Student WHERE yearsOfEnrollment = ?2021")
void deleteStudentByYearsOfEnrollment(int yearsOfEnrollment); 
}
