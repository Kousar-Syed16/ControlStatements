package com.codegnan.controlstatements;

import java.util.Scanner;

public class ParkingFeeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the type of vehicle (car/bike/truck): ");
		String vehicleType = scanner.next().toLowerCase();
		System.out.println("Enter the parking hours: ");
		int hours = scanner.nextInt();
		int rate = 0;
		System.out.println("Is the vehicle is parked between 6PM and 8AM (yes/no): ");
		String nightHours = scanner.next().toLowerCase();
		if (vehicleType.equals("car")) {
			rate = 50;
		} else if (vehicleType.equals("bike")) {
			rate = 30;
		} else if (vehicleType.equals("truck")) {
			rate = 100;
		} else {
			System.out.println("Invalid vehicle type.");
		return;
		}
		double fee = rate * hours;
		if (hours > 5) {
			fee = rate * 0.8;
		}
		if (nightHours.equals("yes")) {
			fee *= 1.5;
		}
		System.out.println("Total Parking Fee is ₹"+fee);
	}
}
