package com.codegnan.controlstatements;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		System.out.println(num+" Table:");
		System.out.println("------------");
		for(int i=0; i<=20; i++) {
			System.out.println( num+ " * "+i+" = "+num*i);
		}
		
	}

}
