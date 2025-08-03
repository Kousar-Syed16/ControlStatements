package com.codegnan.controlstatements;

import java.util.Scanner;

public class PasswordRetry {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String password = "Kousar@1";
		int attempts = 0;
		boolean success = false;
		while(attempts < 3) {
			System.out.println("Enter Password:");
			String input = scanner.next();
			if(input.equals(password)) {
				success = true;
				break;
			}else {
				System.out.println("Incorrect Password.");
				attempts++;
			}
		}
		if(success) {
			System.out.println("Login Successful.");
		} else {
			System.out.println("Too many failed attempts. Account locked.");
		}
		scanner.close();
	}

}
