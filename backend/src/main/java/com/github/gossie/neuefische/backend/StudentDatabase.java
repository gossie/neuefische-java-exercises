package com.github.gossie.neuefische.backend;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDatabase {
    
    private final Map<String, Student> students = new HashMap<>();

    public Collection<Student> determineStudents() {
        return students.values();
    }
    
    public Student determineStudent(String id) {
        return students.get(id);
    }

    public void createStudent(Student student) {
        var id = UUID.randomUUID().toString();
        students.put(id, new Student(id, student.name()));
    }
}
