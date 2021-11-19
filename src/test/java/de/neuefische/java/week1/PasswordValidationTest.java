package de.neuefische.java.week1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void testThatPasswordIsValidWhenItHasExactly26Digits() {
        assertTrue(PasswordValidation.checkPassword("DiesesPasswortHat26Zeichen"));
    }

    @Test
    void testThatPasswordIsValidWithZeroAsNumber() {
        assertTrue(PasswordValidation.checkPassword("DiesesPasswortHatNurEineZahl0"));
    }

    @Test
    void testThatPasswordIsValidWith9AsNumber() {
        assertTrue(PasswordValidation.checkPassword("DiesesPasswortHatNurEineZahl9"));
    }

    @Test
    void testThatPasswordIsNotValidWhenItHas25Digits() {
        assertFalse(PasswordValidation.checkPassword("zuKurz"));
    }

    @Test
    void testThatPasswordIsNotValidWhenItHasNoNumbers() {
        assertFalse(PasswordValidation.checkPassword("DiesesPasswortHatVieleZeichen"));
    }

    @Test
    void testThatPasswordIsInvalidIfOnlyLowerCase() {
        assertFalse(PasswordValidation.checkPassword("diesespasswortistkleingeschriebenhatabereinezahl17"));
    }

    @Test
    void testThatPasswordIsInvalidIfOnlyUpperCase() {
        assertFalse(PasswordValidation.checkPassword("DIESESPASSWORTISTGROSSGESCHRIEBENHATABEREINEZAHL17"));
    }

    @Test
    void testThatAllPasswordsAreValid() {
        assertTrue(PasswordValidation.checkPasswords(List.of("DiesesPasswortHat26Zeichen", "DiesesPasswortHatNurEineZahl0", "DiesesPasswortHatNurEineZahl9")));
    }

    @Test
    void testThatAllValidationsFail() {
        assertFalse(PasswordValidation.checkPasswords(List.of("DiesesPasswortHat26Zeichen", "zuKurz")));
        assertFalse(PasswordValidation.checkPasswords(List.of("DiesesPasswortHat26Zeichen", "DiesesPasswortHatVieleZeichen")));
        assertFalse(PasswordValidation.checkPasswords(List.of("DiesesPasswortHat26Zeichen", "diesespasswortistkleingeschriebenhatabereinezahl17")));
        assertFalse(PasswordValidation.checkPasswords(List.of("DiesesPasswortHat26Zeichen", "DIESESPASSWORTISTGROSSGESCHRIEBENHATABEREINEZAHL17")));
    }

}