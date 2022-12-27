package question1;

import java.util.Comparator;

public class IdComp implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getProductId() - o2.getProductId();
	}

}
