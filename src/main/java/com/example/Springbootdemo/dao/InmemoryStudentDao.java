package com.example.Springbootdemo.dao;

import com.example.Springbootdemo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class InmemoryStudentDao {
    private final List<Student> Students=new ArrayList<>();
    public Student save(Student s){
        Students.add(s);
        return s;
    }
    public List<Student> findAllStudents(){
        return Students;
    }
    public Student findByEmail(String email) {
        return Students.stream()
                .filter(s->email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }


    public Student update(Student s) {
        var studentIndex= IntStream.range(0,Students.size())
                .filter(index->Students.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex>-1){
            Students.set(studentIndex,s);
            return s;
        }
        return null;
    }


    public void delete(String email) {
        var student=findByEmail(email);
        if(student!=null){
            Students.remove(student);
        }

    }





}
