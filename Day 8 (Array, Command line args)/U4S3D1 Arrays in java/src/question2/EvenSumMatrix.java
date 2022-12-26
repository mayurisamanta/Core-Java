package question2;

import java.util.Scanner;

public class EvenSumMatrix {
	
	static void print(int[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] % 2 == 0) {
					sum += matrix[j][i];
				}
			}
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter no of rows");
			int row = sc.nextInt();
			
			System.out.println("Enter no of col");
			int col = sc.nextInt();
			
			int[][] matrix = new int[row][col];
			
			int num = 1;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = num;
					num++;
				}
			}

			print (matrix);
		}
	}
}
