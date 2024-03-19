package Assignment3;

import java.util.Scanner;

//5. Write a program to print factorial of a given number using loop
public class Program5 {
	public static void fact(int n) {
		if(n<0) {
			System.out.println("Invalid \n Value Must be >=0");
			return;
		}
		int  factorial=1;
		int temp=n;
		while(n>0) {
			factorial*=n--;
			
		}
		System.out.println("Factorial Value Of "+temp+" is "+ factorial);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number to Find Factorial:");
		 int  num=sc.nextInt();
		 fact(num);
	}

}
