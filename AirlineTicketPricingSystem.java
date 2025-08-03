package com.codegnan.controlstatements;

import java.util.Scanner;

public class AirlineTicketPricingSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int basePrice = 5000;
		double finalPrice = basePrice;
		System.out.println("Are you (child/senior/adult): ");
		String ageGroup = scanner.next();
		if (ageGroup.equalsIgnoreCase("child")) {
			finalPrice = basePrice * 0.5;
			System.out.println("Passenger Type is Child, So you get 50% discount on your ticket.");		
		} else {
			if (ageGroup.equalsIgnoreCase("senior")) {
				finalPrice = basePrice * 0.8;
				System.out.println("Passenger Type is Senior, So you get 20% discount on your ticket.");
			} else {
				if (ageGroup.equalsIgnoreCase("adult")) {
					System.out.println("Sorry! For Adult Passenger Type No Discount is available.");
				} else {
					System.out.println("Invalid Passenger Type.");
					scanner.close();
					return;
				}
			}
		}
		System.out.println("Enter your booking time (early/normal/last-minute): ");
		String bookingType = scanner.next();
		if (bookingType.equalsIgnoreCase("early")) {
			finalPrice = finalPrice * 0.9;
			System.out.println("Thank you for early booking you get 10% discount.");
		} else {
			if (bookingType.equalsIgnoreCase("normal")) {
				
			} else {
				if (bookingType.equalsIgnoreCase("last-minute")) {
					finalPrice = finalPrice * 1.2;
					System.out.println("Sorry for last-minute booking you get 20% extra charges.");
				} else {
					System.out.println("Invalid Booking Type.");
					scanner.close();
					return;
				}
			}
		}
		System.out.println("Your final ticket price: Rs. "+finalPrice);
		scanner.close();		
	}
}
