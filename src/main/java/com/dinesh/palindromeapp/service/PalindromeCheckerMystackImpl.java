package com.dinesh.palindromeapp.service;

import com.dinesh.palindromeapp.mystack.Mystack;
import com.dinesh.palindromeapp.mystack.MystackImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalindromeCheckerMystackImpl implements PalindromeChecker{
    @Override
    public boolean IsPalindrome(String word) {
        boolean isPalindrome = false;

        Mystack<Character> javaStack = new MystackImpl<>();

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
