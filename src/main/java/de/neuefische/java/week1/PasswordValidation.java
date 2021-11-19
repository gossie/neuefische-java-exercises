package de.neuefische.java.week1;

import java.util.List;
import java.util.Objects;

public class PasswordValidation {
    public static boolean checkPassword(String password) {
        return password.length() > 25
                && password.chars().anyMatch(i -> i >= 48 && i <= 57)
                && !Objects.equals(password, password.toLowerCase())
                && !Objects.equals(password, password.toUpperCase());
    }

    public static boolean checkPasswords(List<String> passwords) {
        return passwords.stream().allMatch(PasswordValidation::checkPassword);
    }
}
