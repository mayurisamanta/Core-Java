package question3;

public class Prime {
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and return array of prime
		//numbers
		//if no prime number is found then return the empty array.
		int line = 0;
		int[] result = new int[inputArray.length];
		for (int i : inputArray) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2 || i == 1) {
				result[line] = i;
				line++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args){
	
		int[] arr = {1,12,15,50,11,14,15};
		Prime p = new Prime();
		int [] result = p.findAndReturnPrimeNumbers (arr);
		
		boolean flag = false;
		for (int i : result) {
			if (i != 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			for (int i : result) {
				if (i != 0) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("Prime number not found in the supplied Array");
		}
	}

}
