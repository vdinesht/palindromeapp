package com.dinesh.palindromeapp;

import com.dinesh.palindromeapp.controller.PalindromeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PalindromicApplicationTests {

	@Autowired
	private PalindromeController controller;


	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
