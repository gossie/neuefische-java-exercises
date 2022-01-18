package de.neuefische.java.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void testThatNumberOfPeopleIsNotYetReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(15, AlarmLevel.YELLOW));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(30, AlarmLevel.YELLOW));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_yellow() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(31, AlarmLevel.YELLOW));
    }

    @Test
    void testThatNumberOfPeopleIsNotYetReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(45, AlarmLevel.GREEN));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(60, AlarmLevel.GREEN));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_green() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(61, AlarmLevel.GREEN));
    }

    @Test
    void testThatNoOneIsAllowedWhenAlarmLevelIsRed() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(1, AlarmLevel.RED));
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(0, AlarmLevel.RED));
    }
    
}