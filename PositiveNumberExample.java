package com.codegnan.controlstatements;

import java.util.Scanner;

public class PositiveNumberExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		if(num>0) {
			System.out.println("The number" + num + "is positive.");
		} else {
			//There is no specific code to execute
		}

	}

}
