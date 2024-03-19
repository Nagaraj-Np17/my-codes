package Task2;

import java.util.Scanner;

public class Number_Reverse {

	public static void main(String[] args) {
		System.out.println("Enter Value Reverse;");		
		Scanner  sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(numReverse(num));
	}

	public static int numReverse(int num) {
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;			
			num/=10;
			}
		return rev;
	}

}
