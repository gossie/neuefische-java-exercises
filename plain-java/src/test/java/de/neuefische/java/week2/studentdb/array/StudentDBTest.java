package de.neuefische.java.week2.studentdb.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void testThatAllStudentsAreReturned() {
        var studentDB = new StudentDB(new Student[]{new Student(), new Student()});
        assertArrayEquals(new Student[]{new Student(), new Student()}, studentDB.list());
    }

    @Test
    void testThaAStudentIsAdded() {
        var studentDB = new StudentDB(new Student[]{new Student(), new Student()});
        studentDB.addStudent(new Student());
        assertArrayEquals(new Student[]{new Student(), new Student(), new Student()}, studentDB.list());
    }

    @Test
    void testThaAStudentIsRemoved() {
        var studentDB = new StudentDB(new Student[]{new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)});
        studentDB.removeStudent(1);
        assertArrayEquals(new Student[]{new Student("eins", "eins", 1), new Student("drei", "drei", 3)}, studentDB.list());
    }

    @Test
    void testThaLastStudentIsRemoved() {
        var studentDB = new StudentDB(new Student[]{new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)});
        studentDB.removeStudent(2);
        assertArrayEquals(new Student[]{new Student("eins", "eins", 1), new Student("zwei", "zwei", 2)}, studentDB.list());
    }

    @Test
    void testThaFirstStudentIsRemoved() {
        var studentDB = new StudentDB(new Student[]{new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)});
        studentDB.removeStudent(0);
        assertArrayEquals(new Student[]{new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)}, studentDB.list());
    }

    @Test
    void testThaPassedIndexIsNotWithinBounds() {
        var studentDB = new StudentDB(new Student[]{new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)});
        assertThrows(IndexOutOfBoundsException.class, () -> studentDB.removeStudent(3));
        assertThrows(IndexOutOfBoundsException.class, () -> studentDB.removeStudent(-1));
    }
}