package com.example.Springbootdemo.dao;

import com.example.Springbootdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByEmail(String email);//spring will create query for us

    void deleteByEmail(String email);
}
