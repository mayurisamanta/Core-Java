package question2enum;

import java.util.Scanner;

public class IPL {

	static void homeTeamStadium(Stadium stadium){
		switch (stadium) {
		case EDEN_GARDENS_STADIUM : System.out.println("This is the home ground of KKR");
		break;
		case WANKHEDE_STADIUM : System.out.println("This is the home ground of Mumbai Indians");
		break;
		case CHIDAMBARAM_STADIUM : System.out.println("This is the home ground of CSK”");
		break;
		case M_CHINNASWAMY_STADIUM : System.out.println("This is the home ground of RCB”");
		break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stadium name (capital letter seperated by _)");
		String stadium = sc.nextLine();
		
		homeTeamStadium(Stadium.valueOf(stadium));
		sc.close();
	}
}
