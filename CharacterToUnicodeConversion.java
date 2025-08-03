package com.codegnan.controlstatements;

import java.util.Scanner;

public class CharacterToUnicodeConversion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch = scanner.next().charAt(0);
		
		System.out.println((int)ch); //implicit type casting
		scanner.close();
	}

}
