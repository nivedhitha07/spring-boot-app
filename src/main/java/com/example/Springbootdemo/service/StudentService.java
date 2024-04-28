package com.example.Springbootdemo.service;

import com.example.Springbootdemo.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student("Nivi","Sriniv",LocalDate.now(),"nivi@gmail.com",13),
                new Student("Raji","Sriniv", LocalDate.now(),"nivi@gmail.com",13)
        );
    }

}
