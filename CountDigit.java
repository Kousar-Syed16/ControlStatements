package com.codegnan.controlstatements;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scanner.nextInt(); //to take input from user
		int count = 0;
		
		while (num > 0) {
			int lastDigit = num % 10;
			num /= 10;
			count++;
		}
		System.out.println(count);
	}

}
