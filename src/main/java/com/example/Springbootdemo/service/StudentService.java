package com.example.Springbootdemo.service;

import com.example.Springbootdemo.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {
     public List<Student> findAllStudents();



}
