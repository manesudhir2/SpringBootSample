package com.example.sample.controller;

import java.util.Scanner;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

	@GetMapping("/palindromeNumber/")
	public String palindrome(@RequestParam("number") int number) {
		
		int num = number;
		int tmp=0,rem=0,sum=0;
		
		tmp = num;
		while(num>0) {
			rem = num%10;
			sum = (sum * 10) + rem;
			num = num/10;
		}
		if(tmp==sum) {
			return "Number is Palindrome";
		}else {
			return "Number is not Palindrome";
		}
	}

	@GetMapping("/palindromeWord/")
	public String reverse(@RequestParam String word) {
	
		String reverse = "";
		
		for(int i=word.length()-1;i>=0;i--) {
			reverse = reverse + word.charAt(i);
		}
		
		if(word.equals(reverse)) {
			return "String is palindrome";
		}else {
			return "String is not palindrome";
		}
	}
	
	@GetMapping("/reverseEachWordButNotSequence/")
	@ResponseStatus(HttpStatus.OK)
	public String reverseEachWordButNotSequence(@RequestParam("statement") String statement) {
	
		String reversedString = "", reverseWord = "";
		
		System.out.println("Reversed statement: "+statement);
		
		String words[] = statement.split("\\s");
		
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			reverseWord = "";
			
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println("Reversed statement: "+reversedString);
		return reversedString;
	}
}
