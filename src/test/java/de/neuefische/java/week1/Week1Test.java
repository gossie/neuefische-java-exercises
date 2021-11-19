package de.neuefische.java.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Week1Test {

    @Test
    void testSum() {
        assertEquals(24, Week1.sum(17, 7));
    }

    @Test
    void testThatValueIsBiggerThanHundred() {
        assertTrue(Week1.checkValue(101));
        assertFalse(Week1.checkValue(100));
    }

    @Test
    void testThatNumberOfPeopleIsNotYetReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Week1.checkNumberOfCustomers(15, "gelb"));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Week1.checkNumberOfCustomers(30, "gelb"));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_yellow() {
        assertEquals("Zu viele Personen", Week1.checkNumberOfCustomers(31, "gelb"));
    }

    @Test
    void testThatNumberOfPeopleIsNotYetReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Week1.checkNumberOfCustomers(45, "grün"));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Week1.checkNumberOfCustomers(60, "grün"));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_green() {
        assertEquals("Zu viele Personen", Week1.checkNumberOfCustomers(61, "grün"));
    }

    @Test
    void testThatNoOneIsAllowedWhenAlarmLevelIsRed() {
        assertEquals("Zu viele Personen", Week1.checkNumberOfCustomers(1, "rot"));
        assertEquals("Maximale Personenzahl nicht überschritten", Week1.checkNumberOfCustomers(0, "rot"));
    }

    @Test
    void testUnknownAlarmLevel() {
        assertThrows(IllegalArgumentException.class, () -> Week1.checkNumberOfCustomers(100, "unknown"));
    }

    @Test
    void testFac() {
        assertEquals(1, Week1.fac(0));
        assertEquals(1, Week1.fac(1));
        assertEquals(2, Week1.fac(2));
        assertEquals(6, Week1.fac(3));
    }

    @Test
    void testCreateStudents() {
        var students = Week1.createStudents(100);
        assertEquals(100, students.length);
        for (int i=0; i< students.length; i++) {
            assertEquals("Student " + i, students[i]);
        }
    }
}