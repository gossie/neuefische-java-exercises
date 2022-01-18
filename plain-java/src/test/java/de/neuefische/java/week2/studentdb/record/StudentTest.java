package de.neuefische.java.week2.studentdb.record;

import de.neuefische.java.week2.studentdb.array.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void testLastname() {
        var student = new de.neuefische.java.week2.studentdb.array.Student();
        student.setLastname("Schreck");
        assertEquals("Schreck", student.getLastname());
    }

    @Test
    void testFirstname() {
        var student = new de.neuefische.java.week2.studentdb.array.Student();
        student.setFirstname("André");
        assertEquals("André", student.getFirstname());
    }

    @Test
    void testAge() {
        var student = new de.neuefische.java.week2.studentdb.array.Student();
        student.setAge(36);
        assertEquals(36, student.getAge());
    }

    @Test
    void testFullName() {
        var student = new de.neuefische.java.week2.studentdb.array.Student();
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