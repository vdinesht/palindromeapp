package com.dinesh.palindromeapp.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPalindromeCheckerMyStackImpl{

    private final PalindromeChecker palindromeChecker;

    TestPalindromeCheckerMyStackImpl(){
        palindromeChecker = new PalindromeCheckerMystackImpl();
    }
    @Test
    void checkForPalindrome() {

        assertTrue(palindromeChecker.IsPalindrome("aaaaa"));
        assertFalse(palindromeChecker.IsPalindrome("dinesh"));
        assertTrue(palindromeChecker.IsPalindrome("rotator"));
    }

    @Test
    void checkForPalindromeList(){
        List<String> words = new ArrayList<>();
        words.add("madam");
        words.add("aaaaa");
        words.add("bbb");
        words.add("reviver");
        words.add("Excitement");

        Map<String, Boolean> mapTestResult =  palindromeChecker.TestForPalindrome(words);

        assertTrue(mapTestResult.get("aaaaa"));
        assertFalse(mapTestResult.get("Excitement"));
        assertTrue(mapTestResult.get("bbb"));

    }
}
