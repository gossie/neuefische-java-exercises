package de.neuefische.java.week2.studentdb.record;

import java.util.Arrays;

public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] list() {
        return students;
    }

    public Student randomStudent() {
        return students[(int) (Math.random() * (students.length - 1))];
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    public void addStudent(Student student) {
        var newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[students.length] = student;
        students = newStudents;
    }

    public void removeStudent(int index) {
        var newStudents = new Student[students.length - 1];
        System.arraycopy(students, 0, newStudents, 0, index);
        System.arraycopy(students, index + 1, newStudents, index, students.length - (index + 1));
        students = newStudents;
    }
}
