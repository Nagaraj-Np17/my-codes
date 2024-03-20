package assignment5;

import java.util.Scanner;

public class Program4 extends Object{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		int N = sc.nextInt();
		int[][] spiral = new int[N][N];
		int value = 1;
		int minCol = 0;
		int maxCol = N - 1;
		int minRow = 0;
		int maxRow = N - 1;

		while (value <= N * N) {
			for (int i = minCol; i <= maxCol; i++) {
				spiral[minRow][i] = value;
				value++;
			}

			for (int i = minRow + 1; i <= maxRow; i++) {
				spiral[i][maxCol] = value;
				value++;
			}

			for (int i = maxCol - 1; i >= minCol; i--) {
				spiral[maxRow][i] = value; 
				value++;
			}
 
			for (int i = maxRow - 1; i >= minRow + 1; i--) {
				spiral[i][minCol] = value;
				value++;
			}

			minCol++;
			minRow++;
			maxCol--;
			maxRow--;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(spiral[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
