package com.telusko.SpringJDBC.SpringJDBC.service;
import com.telusko.SpringJDBC.SpringJDBC.model.Student;
import com.telusko.SpringJDBC.SpringJDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo ;
    public StudentRepo getRepo() {return repo;}
    @Autowired
    public void setRepo(StudentRepo repo) {this.repo = repo;}

    public void addStudent(Student s) {repo.save(s);}

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public StudentService() {
      System.out.println("Object Crated for STUDENTSERVICE");
    }
}
