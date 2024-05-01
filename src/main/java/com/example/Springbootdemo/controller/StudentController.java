package com.example.Springbootdemo.controller;

import com.example.Springbootdemo.model.Student;
import com.example.Springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }//this is constructor injection

    //@Autowired
    //StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }
    @PostMapping
    public Student save(@RequestBody Student student){//map and serialize from json to student object we use requestboday
        return studentService.save(student);
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){//we can using path parameter or request param
        //if parameter is different,you can mention that as @PathVariable("email) String em
        return studentService.findByEmail(email);
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student s){//requestboday for serializing
        return studentService.update(s);
    }
    @DeleteMapping("/{email}")
    public void delete(@PathVariable String email){
        studentService.delete(email);
    }
}
