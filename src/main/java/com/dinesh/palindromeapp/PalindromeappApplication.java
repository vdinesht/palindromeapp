package com.dinesh.palindromeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PalindromeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalindromeappApplication.class, args);
	}

	@GetMapping("/palindrome")
	public String hello(@RequestParam(value = "words", defaultValue = "madam") String name) {
		return String.format("Hello %s!", name);
	}
}
