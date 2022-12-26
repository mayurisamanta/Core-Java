package question1;

import java.util.Arrays;

public class Question1 {
	public static void main(String[] args) {
//Question 1
//Why String is immutable in java and what is the difference between String and String Builder? And
//Write some of the methods of String class at least 5 with example		
		
		// string is refered as object in java and object is reference variable.
		// It doesnot hold the value , it will point to address where value is located(Heap area).
		
		//when we use methods in string it will give new string as string is immutable.
		//when we use methods in string Builder it will give modify the original string.
		
//		some of the methods of String class
		String m = "Mayuri";
		String n = "Mayuri";
		String res = m.toLowerCase();
		System.out.println(res); //mayuri
		
		String res1 = m.toUpperCase();
		System.out.println(res1); //MAYURI
		
		boolean res2 = m.equals(n);
		System.out.println(res2); //true
		
		char[] c = m.toCharArray();
		System.out.println(Arrays.toString(c));
		
		String o = "Ma.yu.ri";
		String[] s = o.split(".");
		System.out.println(Arrays.toString(s));
		
		
//Question 2
//What is the difference between equals method and == operator in java? And what will be the output 
//of the following code snippets and giving proper explanation.
// Ans :- equals method check the content of string whereas == operator checks address of string.		
//		Code snippet 1
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));
// Here outcome is true because both the strings are compared with equals to method. equals to method
// check for content of string.
		
//		Code snippet 2
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(sb1.equals(sb2));
// outcome is false because both the StringBuilder are created with new operator so JVM will create 		
// seperate space for both the StringBuilder. So the address is different for both the strings and
// equals operator checks for address of StringBuilder.
		
//		Code snippet 3
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s3==s4);
// outcome is false because both the strings are created with new operator so JVM will create 		
// seperate space for both the strings. So the address is different for both the strings and
// == operator checks for address of strings.		

	}
}
