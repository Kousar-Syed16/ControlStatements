package com.codegnan.controlstatements;

import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pinNumber = 1234;
		double balance = 5000;
		int choice;
		System.out.println("Enter your Pin Number:");
		int pin=scanner.nextInt();
		if(pin!=1234) {
			System.out.println("Please provide correct pin.");
			return;
		}
		do {
			System.out.println("||===========================||");
			System.out.println("||==========Atm Menu=========||");
			System.out.println("||========1. Deposit=========||");
			System.out.println("||========2. Withdraw========||");
			System.out.println("||========3. Check Balance===||");
			System.out.println("||==========4. Exit==========||");
			System.out.println("||===========================||");
			System.out.println("Enter your choice:");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Please Enter Your Deposit Amount:");
				double depositAmount=scanner.nextDouble();
				if(depositAmount<500) {
					System.out.println("Please Deposit More than 500 rupees");
				} else {
					if(depositAmount%100 != 0) {
						System.out.println("Please Deposit Multiple of 100 like(700,1200,2000)");
					} else {
						balance += depositAmount;
						System.out.println("Deposited succuessfully "+depositAmount+" your new balance is "+balance);
					}
				}
				break;
			case 2:
				System.out.println("Please Enter Withdraw Amount");
				double wthAmount = scanner.nextDouble();
				if(wthAmount<500) {
					System.out.println("Please Withdraw More than 500 rupees");
				} else {
					if(wthAmount %100 != 0) {
						System.out.println("Please Withdraw Multiple of 100 like(700,1200,2000)");
					} else {
						if(wthAmount > balance) {
							System.out.println("Insufficient Balance");
						} else {
							balance -= wthAmount;
							System.out.println("Withdraw succuessfully "+wthAmount+" your new balance is "+balance);
						}
					}
				}
				break;
			case 3:
				System.out.println("Your balance is"+balance);
				break;
			case 4:
				System.out.println("Existing..Thank you for using ATM!");
				break;
			default:
				System.out.println("Invalid choice. Please choose a valid option(1-4)");
			}
		}while(choice != 4 );
		scanner.close();

	}

}
