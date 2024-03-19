package Assignment4;

import java.util.Scanner;

//1. Write a function to return index in which the given number occurs for the second 
//time in an array, -1 if not present for the second time.
//Input:
//Array: [2,3,4,2,8,7]
//Number: 2
public class Program1 {

	public static void AvailableIndex(int arr[],int search) {
		int index=-1;int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				count++;
			}
			if(count==2) {
				index=i;
				break;
			}
			
		}
		System.out.println("Index Of The Element Second Occurence:"+index);
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Size of The Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the "+(i+1)+" st Elements:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter The Elements To Search:");
		int search=sc.nextInt();
		AvailableIndex(arr,search);
	}

}
