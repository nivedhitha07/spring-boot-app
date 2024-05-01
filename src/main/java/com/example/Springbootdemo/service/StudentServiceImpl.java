package com.example.Springbootdemo.service;

import com.example.Springbootdemo.dao.InmemoryStudentDao;
import com.example.Springbootdemo.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    private final InmemoryStudentDao dao;

    public StudentServiceImpl(InmemoryStudentDao dao) {
        this.dao = dao;
    }//no need to mentioned autowired, it is done at back with constructor injection

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);

    }
}
