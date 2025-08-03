package com.codegnan.controlstatements;

import java.util.Scanner;

public class AtmWithdrawl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Account Balance:");
		double accountBalance = scanner.nextDouble();
		System.out.println("Enter Withdrawl Amount:");
		double wthAmount = scanner.nextDouble();
		if (wthAmount%100==0 && wthAmount>=500 && wthAmount <= accountBalance) {
			accountBalance -= wthAmount;
			System.out.println("Withdrawl Successfully Rs."+wthAmount+" Remaining account balance is Rs."+accountBalance);
		} else {
			System.out.println("Insufficient Balance/Invalid Amount");
		}
	}
}
