package com.dinesh.palindromeapp;

import com.dinesh.palindromeapp.service.PalindromeChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PalindromeappApplication {

	@Autowired
	PalindromeChecker palindromeChecker;
	public static void main(String[] args) {
		SpringApplication.run(PalindromeappApplication.class, args);
	}

	@GetMapping("/palindrome")
	public String hello(@RequestParam(value = "words", defaultValue = "madam") String name) {
		if (palindromeChecker.IsPalindrome(name)) {
			return String.format("The word %s is a Palindrome!", name);
		}
		else {
			return String.format("The word %s is NOT a Palindrome!", name);
		}

	}
}
