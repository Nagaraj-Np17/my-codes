package Task2;

import java.util.Scanner;

public class Cpattern {

	public static void main(String[] args) {
		System.out.println("Enter num of row:");
		Scanner  sc=new Scanner(System.in);
		int num=sc.nextInt();
		printC(num);

	}

	private static void printC(int  num) {
		//String s="1";
		for(int i=1;i<=num;i++) {
		  for(int j=1;j<=num;j++) {
			if(i==1||i==num || j==1 ) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
