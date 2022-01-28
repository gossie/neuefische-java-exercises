package com.github.gossie.neuefische.backend;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Collection<Student> determineStudents() {
        return studentRepository.findAll();
    }
    
    public Optional<Student> determineStudent(String id) {
        return studentRepository.findById(id);
    }

    public void createStudent(Student student) {
        studentRepository.save(student);
    }

}
