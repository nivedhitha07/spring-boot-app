package com.example.Springbootdemo.service;

import com.example.Springbootdemo.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {
     Student save(Student s);
     public List<Student> findAllStudents();
     Student findByEmail(String email);
     Student update(Student s);
     void delete(String email);



}
