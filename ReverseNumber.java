package com.codegnan.controlstatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int inputNumber = scanner.nextInt();
		int reverseNumber = 0;
		inputNumber = Math.abs(inputNumber);
		while (inputNumber != 0) {
			int lastDigit = inputNumber % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
			inputNumber /= 10;
		}
		System.out.println(reverseNumber);
		scanner.close();
	}
}
