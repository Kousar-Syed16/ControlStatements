package com.codegnan.controlstatements;

import java.util.Scanner;

public class AngstormNumber {
 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int inputNumber = scanner.nextInt();
		int originalNumber = inputNumber;
		int result = 0;
		
		//Count the digits
		int n = String.valueOf(inputNumber).length();
		
		while (inputNumber != 0) {
			int lastDigit = inputNumber % 10;
			result += Math.pow(lastDigit, n);
			inputNumber /= 10;
		}
		
		if (originalNumber == result) {
			System.out.println(originalNumber+" is an Armstrong Number.");
		} else {
			System.out.println(originalNumber+" is not an Armstrong Number.");
		}
		scanner.close();
	}

}
