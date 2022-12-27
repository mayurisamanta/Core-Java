package question1;

import java.util.Comparator;

public class PriceComp implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return (int) (o1.getProductPrice() - o2.getProductPrice());
	}

}
