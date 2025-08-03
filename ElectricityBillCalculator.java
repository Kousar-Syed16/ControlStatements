package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of units consumed: ");
		int units = scanner.nextInt();
		double rate=0;
		char ageGroup;
		double totalBill=0;
		if (units>=0 && units<=100) {
			rate = units * 1.50;
			System.out.println("For "+units+" units Rate is:"+rate);	
		} else {
			if (units>=101 && units<=200) {
				rate = units * 2.00;
				System.out.println("For "+units+" units Rate is:"+rate);
			} else {
				if (units>=201 && units<=300) {
					rate = units * 3.00;
					System.out.println("For "+units+" units Rate is:"+rate);
				} else {
					if (units>300) {
						rate = units * 5.00;
						System.out.println("For "+units+" units Rate is:"+rate);
					} else {
						System.out.println("Please enter correct number of units.");
					}
				}
			}
		}
		if (rate>=1000) {
			totalBill = rate * 0.1;
			totalBill += rate;
			System.out.println("Your total bill exceeds Rs.1000 so 10% are surcharge. Total Bill is:"+totalBill);
		}
		System.out.println("Are you a senior citizen(y/n):");
		ageGroup = scanner.next().charAt(0);
		if (ageGroup =='y') {
			totalBill -= totalBill * 0.05;
			System.out.println("Becoming a Senior Citizen you get 5% discount. Then Total Bill is: "+totalBill);
		}
		scanner.close();

	}

}
