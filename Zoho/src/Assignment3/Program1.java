package Assignment3;

import java.util.Scanner;

//1. Take three numbers from the user and print the greatest number.

public class Program1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in );
	System.out.println("Enter the 1 st Number:");
	float first=sc.nextFloat();	
	System.out.println("Enter the 2 st Number:");
	float second=sc.nextFloat();
	System.out.println("Enter the 3 st Number:");
	float third=sc.nextFloat();
	biggestNumber(first,second,third);
	
	}

	private static void biggestNumber(float first, float second, float third) {
	float max=(first>second)?(first>third)?first:third:second>third?second:third;
		System.out.println("Max Value of three Value ="+max);
	}

}
