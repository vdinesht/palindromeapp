package com.dinesh.palindromeapp.service;

import java.util.Stack;

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
}
