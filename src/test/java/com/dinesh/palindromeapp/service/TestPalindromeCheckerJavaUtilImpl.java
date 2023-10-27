package com.dinesh.palindromeapp.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPalindromeCheckerJavaUtilImpl {

    private final PalindromeChecker palindromeChecker;

    TestPalindromeCheckerJavaUtilImpl(){
        palindromeChecker = new PalindromeCheckerJavaUtilImpl();
    }
    @Test
    void checkForPalindrome() {

        assertTrue(palindromeChecker.IsPalindrome("madam"));
        assertFalse(palindromeChecker.IsPalindrome("dinesh"));
    }

    @Test
    void checkForPalindromeList(){
        List<String> words = new ArrayList<>();
        words.add("madam");
        words.add("dinesh");
        words.add("rotator");
        words.add("reviver");
        words.add("Excitement");

        Map<String, Boolean> mapTestResult =  palindromeChecker.TestForPalindrome(words);

        assertTrue(mapTestResult.get("madam"));
        assertFalse(mapTestResult.get("Excitement"));
        assertTrue(mapTestResult.get("rotator"));

    }
}
