package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int inputNumber = scanner.nextInt();
		int originalNumber = inputNumber;
		int reverseNumber = 0;
		while (inputNumber != 0) {
			int lastDigit = inputNumber % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
			inputNumber /= 10;
		}
		System.out.println(reverseNumber);
		if (originalNumber == reverseNumber) {
			System.out.println("It is a palindrome number.");
		} else {
			System.out.println("Not a palindrome number.");
		}
		scanner.close();

	}

}
