package com.codegnan.controlstatements;

import java.util.Scanner;

public class DivisableByFive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		if(num%5==0) {
			System.out.println("The given number "+num+" is divisible by 5");
		} else {
			//There is no specific code to execute
		}
		scanner.close();
	}

}
