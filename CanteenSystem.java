package com.codegnan.controlstatements;

import java.util.Scanner;

public class CanteenSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		int itemNumber=0;
		int quantity=0;
		do {
			System.out.println("||===========CANTEEN MENU=============||");
			System.out.println("1.View Menu");
			System.out.println("2.Order Items");
			System.out.println("3.View Bill");
			System.out.println("4.Checkout and Exit");
			System.out.println("Enter you choice:");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("---MENU---");
				System.out.println("1.Tea - Rs.10");
				System.out.println("2.Coffee - Rs.15");
				System.out.println("3.Samosa - Rs.20");
				break;
			case 2:
				System.out.println("Enter item number to order (1-3):");
				itemNumber = scanner.nextInt();
				System.out.println("Enter quantity:");
				quantity = scanner.nextInt();
				if (itemNumber == 1) {
					System.out.println(quantity+" Tea(s) added.");
				} else {
					if (itemNumber == 2) {
						System.out.println(quantity+" Coffee(s) added.");
					} else {
						if (itemNumber == 3) {
							System.out.println(quantity+" Samosa(s) added.");
						} else {
							System.out.println("Please enter item number only (1-3).");
						}
					}
				}
				break;
			case 3:
				double bill=0;
				if (itemNumber == 1) {
					bill = (10 * quantity);
					System.out.println("Tea * "+quantity+" = Rs." +bill);
				} else {
					if (itemNumber == 2) {
						bill = (15 * quantity);
						System.out.println("Coffee * "+quantity+" = Rs."+bill);
					}else {
						if (itemNumber == 3) {
							bill = (20 * quantity);
							System.out.println("Samosa * "+quantity+" = Rs."+bill);	
						}
					}
				}
				System.out.println("Subtotal = "+bill);
				double tax = bill * 0.05;
				System.out.println("Tax (5%) = "+tax);
				double total = bill + tax;
				System.out.println("Total = "+total);
				break;
			case 4:
				System.out.println("Thank you! Exiting system.");
				break;
			default:
				System.out.println("Invalid choice. Please choose a valid option(1-3):");
			}
		} while (choice != 4 );
		scanner.close();
	}
}
