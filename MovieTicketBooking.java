package com.codegnan.controlstatements;

import java.util.Scanner;

public class MovieTicketBooking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String movieName;
		int tickets;
		double totalAmount = 0;
		char continueBooking;
		do {
			System.out.println("Enter Movie Name: ");
			movieName = scanner.next();
			System.out.println("Enter Number of Tickets: ");
			tickets = scanner.nextInt();
			double pricePerTicket = 150;
			double cost = tickets * pricePerTicket;
			totalAmount += cost;
			System.out.println("Booked "+tickets+" tickets for "+movieName+" cost:Rs."+cost);
			System.out.println("Do you want to book another movie(y/n): ");
			continueBooking = scanner.next().charAt(0);
		}while(continueBooking == 'y');
		System.out.println("Total Booking Amount: "+totalAmount);
		System.out.println("Thank you for booking. Enjoy the movie!");
		scanner.close();
	}

}
