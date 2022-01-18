package de.neuefische.java.week3;

public class Alarm {

    public static String checkNumberOfCustomers(int numberOfCustomers, AlarmLevel alarmLevel) {
        return alarmLevel.getMessage(numberOfCustomers);
    }

}
