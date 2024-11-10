package com.example.CRUD_application.CRUD_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CRUD_application.CRUD_application.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
