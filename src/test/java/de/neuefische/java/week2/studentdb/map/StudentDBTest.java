package de.neuefische.java.week2.studentdb.map;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentDBTest {

    @Test
    void testThatAllStudentsAreReturned() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2)));
        assertTrue(studentDB.list().containsAll(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2))));
    }

    @Test
    void testThaAStudentIsAdded() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2)));
        studentDB.addStudent(new Student("drei", "drei", 3));
        assertTrue(studentDB.list().containsAll(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3))));
    }

    @Test
    void testThaAStudentIsRemoved() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)));
        studentDB.removeStudent("zwei zwei");
        assertTrue(studentDB.list().containsAll(List.of(new Student("eins", "eins", 1), new Student("drei", "drei", 3))));
    }

    @Test
    void testThaLastStudentIsRemoved() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)));
        studentDB.removeStudent("drei drei");
        assertTrue(studentDB.list().containsAll(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2))));
    }

    @Test
    void testThaFirstStudentIsRemoved() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)));
        studentDB.removeStudent("eins eins");
        assertTrue(studentDB.list().containsAll(List.of(new Student("zwei", "zwei", 2), new Student("drei", "drei", 3))));
    }
}