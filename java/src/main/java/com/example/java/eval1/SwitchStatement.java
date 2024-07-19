package com.example.java.eval1;

public class SwitchStatement {

	public static void main(String[] args) {
		printMonth("FEB");
	}
	public static void printMonth(String month){
		switch (month) {
		case "JAN" : System.out.println("This is the 1st Month of the Year January");
		break;
		case "FEB" : System.out.println("This is the 2st Month of the Year February");
		break;
		case "MAR" : System.out.println("This is the 3st Month of the Year March");
		break;
		case "API" : System.out.println("This is the 4st Month of the Year April");
		break;
		case "MAY" : System.out.println("This is the 5st Month of the Year May");
		break;
		case "JUN" : System.out.println("This is the 6st Month of the Year June");
		break;
		case "JUL" : System.out.println("This is the 7st Month of the Year July");
		break;
		case "AUG" : System.out.println("This is the 8st Month of the Year August");
		break;
		case "SEP" : System.out.println("This is the 9st Month of the Year September");
		break;
		case "OCT" : System.out.println("This is the 10st Month of the Year October");
		break;
		case "NOV" : System.out.println("This is the 11st Month of the Year November");
		break;
		case "DEC" : System.out.println("This is the 12st Month of the Year December");
		}
	}

}
