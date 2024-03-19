package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	public static int []rotation(int[]arr,int start,int end){
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;end--;
		}
		return arr;
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size:");
		int size=sc.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the "+(i+1)+" st Value In Integer:");
			array[i]=sc.nextInt();
		}

		System.out.println("Enter The Rotation of Array:");
		int rotation=sc.nextInt();
		rotation=rotation%size;
		array=rotation(array,0,rotation-1);
		array=rotation(array,rotation,size-1);
		array=rotation(array,0,size-1);
		for(int i:array) {
			System.out.print(i+" ");
		}
	}
	

}
