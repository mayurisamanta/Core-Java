package com.example.java.day2.fundamentals;

public class SwitchStatement {

    public static void main(String[] args) {
        String city = "Mumbai";

        switch(city){
            case "Mumbai" : System.out.println("Financial city");
                break;
            case "Kolkata" : System.out.println("City of Joy");
                break;
            case "Delhi" : System.out.println("Capital of the country");
                break;
            case "Bangalore" : System.out.println("Cyber city");
                break;
            default : System.out.println("May be other Indian city");
        };

        //switch without break statement Java 12
        int day = 2;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");

        }
    }
}
