package q4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {

	List<Product> productList=new ArrayList<>();
	
	void addProduct(Product product) {
		if (productList.size() != 0) {
			boolean flag = true;
			for (int i = 0; i < productList.size(); i++) {
				
				Product p = productList.get(i);
				
				if (p.getCompany().equals(product.getCompany()) && p.getName().equals(product.getName())  && 
				p.getPrice() == product.getPrice()){
					
					int price = p.getCount();
					price += product.getCount();
					p.setCount(price);
					
					System.out.println("Count updated Product already exists");
					flag = false;
					break;
				}
			}
			
			if (flag) {
				productList.add(product);
				System.out.println("Product added successfully");
			}
		}
		else {
			productList.add(product);
			System.out.println("Product added successfully");
		}
		
	}
	
	List<Product> showAllProduct(){
		return productList;
		
	}
}
