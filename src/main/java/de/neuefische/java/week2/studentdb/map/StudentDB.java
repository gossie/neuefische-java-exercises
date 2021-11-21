package de.neuefische.java.week2.studentdb.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentDB {

    private final Map<String, Student> students = new HashMap<>();

    public StudentDB(List<Student> students) {
        this.students.putAll(
                students
                        .stream()
                        .collect(Collectors.toMap(s -> s.getFirstname() + " " + s.getLastname(), Function.identity()))
        );
    }

    public List<Student> list() {
        return Collections.unmodifiableList(new ArrayList<>(students.values()));
    }

    public Student randomStudent() {
        return list().get((int) (Math.random() * (students.size() - 1)));
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public void addStudent(Student student) {
        students.put(student.getFullName(), student);
    }

    public void removeStudent(String fullName) {
        students.remove(fullName);
    }
}
