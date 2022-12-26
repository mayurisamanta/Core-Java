package question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> a = new ArrayList<>();
			
			a.add("Mumbai");
			a.add("Chennai");
			a.add("Bangalore");
			a.add("Delhi");
			a.add("Hyderabad");
			a.add("Pune");
			a.add(null);
			
			//Using iterator
			Iterator<String> al = a.iterator();
			
			while (al.hasNext()) {
				System.out.println(al.next());
			}
			
			//Using list iterator
			ListIterator<String> ll = a.listIterator();
			while (ll.hasNext()) System.out.println(ll.next());
			
			//Using for loop
			
			for (int i = 0; i < a.size(); i++) {
				System.out.println(a.get(i));
			}
			
			//Using enhanced loop
			
			for (String s : a) {
				System.out.println(s);
			}
	}

}
