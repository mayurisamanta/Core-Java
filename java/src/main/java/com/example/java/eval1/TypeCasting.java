package com.example.java.eval1;

public class TypeCasting {
	public static void main(String[] args) {
		int a = 64;
		int b = 70;
		byte c = (byte) (a+b); //typecast (a+b) to byte
		System.out.println(c);
	}
	
	
//	result data type will be according to the following formula:
//	max (int, type1, type2, type3,...)
//	according to the above formula, the result data type of the above expression will be “int”
//	max (int, byte, byte) ——> int
}
