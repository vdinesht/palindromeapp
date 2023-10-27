package com.dinesh.palindromeapp.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

@Service
public class PalindromeCheckerJavaUtilImpl implements PalindromeChecker{
    @Override
    public boolean IsPalindrome(String word) {
        boolean isPalindrome = false;

        Stack<Character> javaStack = new Stack<>();

        for(char c:  word.toCharArray()) {
            javaStack.push(c);
        }

        if (word.length() == javaStack.size()){
            isPalindrome = true;
            for(char c: word.toCharArray()){
                if (c != javaStack.pop()) {
                    isPalindrome = false;
                }
            }
        }
        return isPalindrome;
    }

    @Override
    public Map<String, Boolean> TestForPalindrome(List<String> words) {
        Map<String, Boolean> mapPalindromeTestResult = new HashMap<>();
        for(String word: words){
            mapPalindromeTestResult.put(word, IsPalindrome(word));
        }
        return mapPalindromeTestResult;
    }
}
