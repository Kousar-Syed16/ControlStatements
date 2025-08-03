package com.codegnan.controlstatements;

import java.util.Scanner;

public class MobileBalance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the plan duration in minutes:");
		int duration = scanner.nextInt();
		if (duration<100) {
			System.out.println("For "+duration+" minutes you get Basic Plan.");
		} else {
			if (duration>=100&&duration<300) {
				System.out.println("For "+duration+" minutes you get Standard Plan.");
			} else {
				if (duration>=300&&duration<500) {
					System.out.println("For "+duration+" minutes you get Premium Plan.");
				} else {
					if (duration>=500) {
						System.out.println("For "+duration+" minutes you get Unlimited Plan.");
					} else {
						System.out.println("Invalid");
					}
				}
			}
		}

	}

}
