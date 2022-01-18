package de.neuefische.java.week2.studentdb.record;

public record Student(String firstname, String lastname, int age) {

    public String fullName() {
        return firstname + " " + lastname;
    }

}
