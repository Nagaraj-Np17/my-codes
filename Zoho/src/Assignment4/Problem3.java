package Assignment4;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Size of The Array: (In +ve)");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the "+(i+1)+" st Elements:");
			arr[i]=sc.nextInt();
		}
		evenSum(arr);
		
	}

	private static void evenSum(int []arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				continue;
			}
			sum+=arr[i];
		}
		System.out.println("The Sum of Even Numbers in Array="+sum);
	}

}
