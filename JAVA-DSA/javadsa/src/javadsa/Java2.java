package javadsa;

import java.util.Scanner;

public class Java2 {
        public static void main(String[] args) {
        	Scanner inputScanner = new Scanner(System.in);
        	while (true) {
        	System.out.println("String Operations Menu:");
        	System.out.println("1. Concatenate Strings");
        	System.out.println("2. Find Length of a String");
        	System.out.println("3. Convert to Uppercase and Lowercase");
        	System.out.println("4. Extract Substring");
        	System.out.println("5. Split a Sentence");
        	System.out.println("6. Reverse a String");
        	System.out.println("7. Exit");
        	System.out.print("Enter your choice: ");
        	int choice = inputScanner.nextInt();
        	inputScanner.nextLine(); // Consume the newline character
        	switch (choice) {
        	case 1:
        	concatenateStrings(inputScanner);
        	break;
        	case 2:
        	findStringLength(inputScanner);
        	break;
        	case 3:
        	convertToUppercaseAndLowercase(inputScanner);
        	break;
        	case 4:
        	extractSubstring(inputScanner);
        	break;
        	case 5:
        	splitSentence(inputScanner);
        	break;
        	case 6:
        	reverseString(inputScanner);
        	break;
        	case 7:
        	System.out.println("Exiting the program.");
        	inputScanner.close();
        	System.exit(0);
        	default:
        	System.out.println("Invalid choice. Please select a valid option.");
        	}
        	}
        	}
        	private static void concatenateStrings(Scanner scanner) {
        	System.out.print("Enter the first string: ");
        	String firstString = scanner.nextLine();
        	System.out.print("Enter the second string: ");
        	String secondString = scanner.nextLine();
        	String concatenatedString = firstString + secondString;
        	System.out.println("Concatenated string: " + concatenatedString);
        	}
        	private static void findStringLength(Scanner scanner) {
        	System.out.print("Enter a string: ");
        	String inputString = scanner.nextLine();
        	int length = inputString.length();
        	System.out.println("Length of the string: " + length);
        	}
        	private static void convertToUppercaseAndLowercase(Scanner scanner) {
        	System.out.print("Enter a string: ");
        	String inputString = scanner.nextLine();
        	String uppercaseString = inputString.toUpperCase();
        	String lowercaseString = inputString.toLowerCase();
        	System.out.println("Uppercase: " + uppercaseString);
        	System.out.println("Lowercase: " + lowercaseString);
        	}
        	private static void extractSubstring(Scanner scanner) {
        	System.out.print("Enter a string: ");
        	String inputString = scanner.nextLine();
        	System.out.print("Enter the starting index: ");
        	int startIndex = scanner.nextInt();
        	scanner.nextLine(); // Consume the newline character
        	System.out.print("Enter the ending index: ");
        	int endIndex = scanner.nextInt();
        	scanner.nextLine(); // Consume the newline character
        	if (startIndex < 0 || endIndex >= inputString.length() || startIndex > endIndex) {
        	System.out.println("Invalid indices. Please enter valid indices.");
        	return;
        	}
        	String extractedSubstring = inputString.substring(startIndex, endIndex + 1);
        	System.out.println("Extracted substring: " + extractedSubstring);
        	}
        	private static void splitSentence(Scanner scanner) {
        	System.out.print("Enter a sentence: ");
        	String sentence = scanner.nextLine();
        	String[] words = sentence.split(" ");
        	System.out.println("Words in the sentence:");
        	for (String word : words) {
        	System.out.println(word);
        	}
        	}
        	private static void reverseString(Scanner scanner) {
        	System.out.print("Enter a string: ");
        	String inputString = scanner.nextLine();
        	StringBuilder reversedString = new StringBuilder(inputString).reverse();
        	System.out.println("Reversed string: " + reversedString);
        	
        	
        	
        	}
}