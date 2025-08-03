package com.codegnan.controlstatements;

import java.util.Scanner;

public class WishMessage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the time in hours:");
		int time = scanner.nextInt();
		if(time>=4&&time<=12) {
			System.out.println("Hello Riya! Good Morning");
		} else {
			if(time>12&&time<=16) {
				System.out.println("Hello Sunny! Good Afternoon");
			} else {
				if(time>16&&time<=24) {
					System.out.println("Hello Bunny! Good Evening");
				} else {
					System.out.println("Hello Vinny! Bye Bye!");
				}
			}
		}

	}

}
