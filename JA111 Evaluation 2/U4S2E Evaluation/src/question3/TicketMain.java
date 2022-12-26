package question3;

import java.util.Scanner;

public class TicketMain {
	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter no of bookings");
			int numOfBookings = sc.nextInt();
			
			System.out.println("Enter the available tickets");
			int availableTickets = sc.nextInt();
			Ticket.availableTickets = availableTickets;
			
			for (int i = 0; i < numOfBookings; i++) {
				
				System.out.println("Enter the ticketid");
				int id = sc.nextInt();
				
				System.out.println("Enter the price");
				int price = sc.nextInt();
				
				System.out.println("Enter the no of tickets");
				int numOfTickets = sc.nextInt();
				
				sc.nextLine();
				
				Ticket t1 = new Ticket();
				t1.price = price;
				t1.ticketid = id;
				
				System.out.println("Available tickets : " + Ticket.availableTickets);
				int total = t1.calculateTicketCost(numOfTickets);
				System.out.println("Total amount : " + total);
				System.out.println("Available ticket after booking : " + Ticket.availableTickets);
			}
		}	
	}
}
