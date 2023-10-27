package com.dinesh.palindromeapp;

import com.dinesh.palindromeapp.service.HtmlTableFormatterImpl;
import com.dinesh.palindromeapp.service.PalindromeChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@SpringBootApplication
@RestController
public class PalindromeappApplication {

	@Autowired
	PalindromeChecker palindromeChecker;
	
	@Autowired
	HtmlTableFormatterImpl htmlTableFormatter;
	
	public static void main(String[] args) {
		SpringApplication.run(PalindromeappApplication.class, args);
	}

	@GetMapping("/palindrome")
	public String hello(@RequestParam(value = "words", defaultValue = "madam") String words) {
			return performPalindromeCheckAndReturnHtmlOutput(words);
	}
	
	String performPalindromeCheckAndReturnHtmlOutput(String words){
		List<String> tableHeader = new ArrayList<>();
		tableHeader.add("Word");
		tableHeader.add("Java Util test Result");

		Map<String, Boolean> mapWordToPalindromTest = palindromeChecker.TestForPalindrome(Arrays.asList(words.split(",")));

		List<List<String>> tableBody = new ArrayList<>();

		for (String word: mapWordToPalindromTest.keySet()){
			List<String> row = new ArrayList<>();
			row.add(word);
			if (mapWordToPalindromTest.get(word)) {
				row.add("Is a Palindrome");
			}
			else {
				row.add("NOT a Palindrome");
			}
			tableBody.add(row);
		}

		return htmlTableFormatter.getHtmlOutput("Palindrome Test", tableHeader, tableBody);
	}
}
