package com.dinesh.palindromeapp.controller;

import com.dinesh.palindromeapp.service.HtmlTableFormatterImpl;
import com.dinesh.palindromeapp.service.PalindromeCheckerJavaUtilImpl;
import com.dinesh.palindromeapp.service.PalindromeCheckerMystackImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PalindromeController {
    @Autowired
    private HtmlTableFormatterImpl htmlTableFormatter;


    @GetMapping("/palindrome")
    public String hello(@RequestParam(value = "words", defaultValue = "madam") String words) {
        return performPalindromeCheckAndReturnHtmlOutput(words);
    }

    String performPalindromeCheckAndReturnHtmlOutput(String words){
        List<String> tableHeader = new ArrayList<>();
        tableHeader.add("Word");
        tableHeader.add("Java Stack test Result");
        tableHeader.add("MyStack test Result");

        List<List<String>> tableBody = new ArrayList<>();
        PalindromeCheckerJavaUtilImpl palindromeCheckerJavaUtil = new PalindromeCheckerJavaUtilImpl();
        PalindromeCheckerMystackImpl palindromeCheckerMystack = new PalindromeCheckerMystackImpl();

        for (String word: words.split(",")){
            List<String> row = new ArrayList<>();
            row.add(word);
            row.add(palindromeResultString(palindromeCheckerJavaUtil.IsPalindrome(word)));
            row.add(palindromeResultString(palindromeCheckerMystack.IsPalindrome(word)));
            tableBody.add(row);
        }

        return htmlTableFormatter.getHtmlOutput("Palindrome Test", tableHeader, tableBody);
    }

    private String palindromeResultString(boolean isPalindrome){
        if (isPalindrome){
            return "Is a Palindrome";
        }
        else {
            return "Not a Palindrome";
        }
    }
}
