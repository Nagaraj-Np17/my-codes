package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array:");
		int sizeOfArray = sc.nextInt();
		int arr[] = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.println("Enter The " + (i + 1) + " st Value:");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		while (true) {
			System.out.println("1.Bubble Sort\n2.InsertionSort\n3.Selection Sort\nEnter the Choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				BubbleSort bubbleSort = new BubbleSort();
				bubbleSort.bubbleSort(arr);
				System.out.println("Bubble Sort:");
				System.out.println(Arrays.toString(arr));
				break;
			}
			case 2: {
				InsertionSort insertionSort = new InsertionSort();
				insertionSort.insertionSort(arr);
				System.out.println("InsertionSort:");
				System.out.println(Arrays.toString(arr));
				break;
			}
			case 3: {
				SelectionSort selectionSort = new SelectionSort();
				selectionSort.selectionSort(arr);
				System.out.println("Insertion Sort:");
				System.out.println(Arrays.toString(arr));
				break;
			}
			case 0: {
				System.out.println("Exiting.....");
				return;
			}
			default:
				System.out.println("Invalid Choice!!!!!!");
			}

		}
	}

}
