package question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many products you want to store?");
		
		int num = sc.nextInt();
		
		while (num-- > 0) {
			System.out.println("Enter product id");
			int id = sc.nextInt();
			
			System.out.println("Enter product name");
			String name = sc.next();
			
			System.out.println("Enter product price");
			double price = sc.nextDouble();
			
			Product p = new Product(id, name, price);
			products.add(p);
		}
		
		System.out.println("How you want to sort the products");
		System.out.println("1 for sorting the product according to the productPrice");
		System.out.println("2 for sorting the product according to the productName");
		System.out.println("3 for sorting the product according to the productId");
		
		int choice = sc.nextInt();
		
		if (choice == 1) {
			Collections.sort(products, new PriceComp());
			System.out.println(products);
		}
		else if (choice == 2) {
			Collections.sort(products, new NameComp());
			System.out.println(products);
		}
		else {
			Collections.sort(products, new IdComp());
			System.out.println(products);
		}
		
		sc.close();
	}
}
