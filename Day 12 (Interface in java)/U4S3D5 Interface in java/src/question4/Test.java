package question4;

public class Test implements Intr{

	@Override
	public int[] display(int p) {
		int[] prime = new int[p];
		int line = 0;
		for (int i = 2; i <= p; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				prime[line++] = i;
			}
		}
		return prime;
	}

}
