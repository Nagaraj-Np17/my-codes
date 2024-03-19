package Assignment1;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of num 1:");
		int num1=sc.nextInt();
		System.out.println("Enter value of num 2:");
		int num2=sc.nextInt();

		System.out.println("Before Swapping:");
		System.out.println("Numer 1 = "+num1+"\t Number 2 = "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping:");
		System.out.println("Numer 1 = "+num1+"\t Number 2 = "+num2);
	}

}
