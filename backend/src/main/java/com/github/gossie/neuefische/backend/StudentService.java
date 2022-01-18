package com.github.gossie.neuefische.backend;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentDatabase studentDatabase;

    StudentService(StudentDatabase studentDatabase) {
        this.studentDatabase = studentDatabase;
    }

    public Collection<Student> determineStudents() {
        return studentDatabase.determineStudents();
    }
    
    public Student determineStudent(String id) {
        return studentDatabase.determineStudent(id);
    }

    public void createStudent(Student student) {
        studentDatabase.createStudent(student);
    }

}
