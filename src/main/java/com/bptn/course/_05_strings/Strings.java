package com.bptn.course._05_strings;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		String userName = "testuser";
		System.out.println(userName);
		
		//We have functions and methods in string
		//The always has to be called on the string or object defined
		System.out.println(userName.length()); //This code gives the number of characters 
		System.out.println(userName.charAt(2));
		System.out.println(userName.substring(4)); //portion of the string you wan to extract
		System.out.println(userName.substring(2, 4)); // it starts at index 2 and end at 4
		System.out.println(userName.equals("testusr")); // comparison check ie is what is the bracket same as what was assigned
		System.out.println(userName.trim()); //Important for user input. It takes care of input on both ends not in between.
		System.out.println(userName.indexOf('r')); // Gives first index of what is in parenthesis
	
	
	//Exercise
		
		//Read user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		
		//Declare storage variable
		int vowelCount = 0;
		int consonantCount = 0;
		
		
		//Convert to lowercase
		String lowerCaseInput = input.toLowerCase();
		
		
		//Loop through each character in the string
		for (int i = 0; i<lowerCaseInput.length(); i++) {
			char ch = lowerCaseInput.charAt(i);
			
		
		
		
		//Check if its a vowel or consonant
		if(ch=='a' || ch=='e' ||ch=='i'||ch=='u') {
			
			
			
		//Update count
			vowelCount++;
		} else if (ch>'a' && ch<='z') {
			consonantCount++;
			
			
		}
		
	
	}
//Print the count
		System.out.println("The number of vowels are: "+vowelCount);
		System.out.println("The number of consonants are: "+consonantCount);
		
		scanner.close();
	
	}
}



