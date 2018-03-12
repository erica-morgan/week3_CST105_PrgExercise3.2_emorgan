package pigLatinConverter;

/**
 * Program: Pig Latin Converter
 * File: PigLatinConverter.java
 * Summary: The program will take a user-entered sentence and return the individual words in Pig Latin
 * Author: Erica Morgan
 * Date: 3/9/2018
 */

import java.util.Scanner;

public class PigLatinConverter {
	static String anotherTemp;
	static String temp3;
	static String vowels = "AEIOUY";	
	static String output;
	
	public static void main(String[] args) {
		String[] words;
		
		// Ask user to enter a sentence to be converted
		System.out.println("Enter sentence to be converted to Pig Latin: ");
		Scanner input = new Scanner(System.in);
		
		// Change sentence to uppercase
		String userSentence = input.nextLine();
		String sentence = userSentence.toUpperCase();

		// Split the sentence to separate the words
		words = sentence.split(" ");
		
		//Placeholder
		String beginningWord = "";
		
		//Output
		System.out.println("");
		System.out.println("Pig-latin translation: ");
		
		// Creates the loop that counts how many times it's looped through
		for(int i = 0; i < words.length; i++) {
		
		String temp = words[i];
		int j = 0;	
		//Creates the loop that checks each character in the word
		while ( j<= temp.length()&& !vowels.contains ("" + temp.charAt(j)))
		//If the first letters are consonants 
		{
			beginningWord += temp.charAt(j);
			
			j++;
			output = temp + "\t\t" + temp.substring(j) + beginningWord + "AY";	
		}
		//If the first letter is a vowel
		if(j == 0)
		{
			j = 1;
			output = temp + "\t\t" + temp + "WAY";
		} 
		
		//Prints the output based on all the characters
		System.out.println(output);
		beginningWord = "";
		
		}	
	

	}
}

