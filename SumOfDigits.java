package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scanner.nextInt(); //to take input from user
		int sum = 0;
		
		while (num > 0) {
			int lastDigit = num % 10;
			sum += lastDigit;
			num /= 10;
		}
		System.out.println(sum);
		scanner.close();
	}

}
