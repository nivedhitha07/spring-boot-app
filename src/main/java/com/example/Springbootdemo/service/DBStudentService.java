package com.example.Springbootdemo.service;

import com.example.Springbootdemo.dao.StudentRepository;
import com.example.Springbootdemo.model.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("db")
@Primary
public class DBStudentService implements StudentService{
    private final StudentRepository studentRepository;

    public DBStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public void delete(String email) {
        studentRepository.deleteByEmail(email);
    }
}
