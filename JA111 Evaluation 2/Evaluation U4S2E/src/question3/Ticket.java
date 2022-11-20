package question3;

public class Ticket {
	int ticketid;
	
	int price;
	
	static int availableTickets;
	
	public int calculateTicketCost(int noOfTickets) {
		if (availableTickets >= noOfTickets) {
			availableTickets = availableTickets - noOfTickets;
			int total = (int)noOfTickets * price;
			return total;
		}
		else {
			return -1;
		}
	}
}
