package q5;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		String str = "hello Hello HEllo hi hi: hi! Welcome, welcome";
		
		String[] arr = str.split(" ");
//		System.out.println(Arrays.toString(arr));
	
		TreeSet<String> tr = new TreeSet<>(new Compare());
		
		String sp = ",;:.?!";
		
		for (String s : arr) {
			
			String i = "";
			
			for (int j = 0; j < s.length(); j++) {
				boolean flag = true;
				
				for (int k = 0; k < sp.length(); k++) {
					if (s.charAt(j) == sp.charAt(k)) {
						flag = false;
					}
					
				}
				
				if (flag) {
					i += s.charAt(j);
				}
			}
			tr.add(i.toLowerCase());
		}
		
		int i = 1;
		String result = "";
		for (String s : tr) {
			result += i + ". " +  s + " ";
			i++;
		}
		
		
		
		System.out.println("Number of words " + arr.length + " Number of unique words " + tr.size());
		System.out.println(result);
	}

	
}
