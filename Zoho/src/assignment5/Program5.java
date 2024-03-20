package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		jaggedArray();
		
	}

	private static void jaggedArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Total Number Of Person:");
		int noOfPerson = sc.nextInt();
		int listOfPerson[][] = new int[noOfPerson][];
		for (int i = 0; i < noOfPerson; i++) {
			System.out.println("Enter The  Number Weigth to add in the List:");
			int onOfWeigths = sc.nextInt();
			listOfPerson[i] = new int[onOfWeigths];
			int mini = Integer.MAX_VALUE;
			for (int j = 0; j < onOfWeigths; j++) {
				System.out.println("Enter the " + (j + 1) + " Weigth");
				int weight = sc.nextInt();
				listOfPerson[i][j] = weight;
				if (weight < mini) {
					mini = weight;
				}
			}
			System.out.println("Mini Of weight of  " + (i + 1) + " Row=" + mini);

		}
		System.out.println(Arrays.deepToString(listOfPerson));

		
	}

}
