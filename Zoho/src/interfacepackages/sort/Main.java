package interfacepackages.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        System.out.println("1. Bubble Sort\n2. Merge Sort\n3. Quick Sort");
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();
	        switch (choice) {
	            case 1:
	                BubbleSort b = new BubbleSort();
	                b.sort(arr);
	                break;
	            case 2:
	            	Sortable s = new MergeSort();
	                s.sort(arr);
	                break;
	            case 3:
	            	QuickSort q = new QuickSort();
	                q.sort(arr);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }
	        scanner.close();
	}

}
