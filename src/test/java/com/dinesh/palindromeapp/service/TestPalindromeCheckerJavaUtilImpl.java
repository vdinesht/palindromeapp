package com.dinesh.palindromeapp.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPalindromeCheckerJavaUtilImpl {

    @Test
    void checkForPalindrome() {
        PalindromeChecker palindrome = new PalindromeCheckerJavaUtilImpl();

        assertTrue(palindrome.IsPalindrome("madam"));
        assertFalse(palindrome.IsPalindrome("dinesh"));
    }
}
