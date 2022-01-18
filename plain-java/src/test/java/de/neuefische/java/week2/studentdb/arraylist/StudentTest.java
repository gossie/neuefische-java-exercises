package de.neuefische.java.week2.studentdb.arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void testLastname() {
        var student = new Student();
        student.setLastname("Schreck");
        assertEquals("Schreck", student.getLastname());
    }

    @Test
    void testFirstname() {
        var student = new Student();
        student.setFirstname("André");
        assertEquals("André", student.getFirstname());
    }

    @Test
    void testAge() {
        var student = new Student();
        student.setAge(36);
        assertEquals(36, student.getAge());
    }

    @Test
    void testFullName() {
        var student = new Student();
        student.setFirstname("André");
        student.setLastname("Schreck");
        assertEquals("André Schreck", student.getFullName());
    }

    @Test
    void testToString() {
        var student = new Student("André", "Schreck", 36);
        assertEquals("firstname: André, lastname: Schreck, age: 36", student.toString());
    }

}