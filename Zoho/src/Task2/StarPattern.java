package Task2;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		System.out.println("Enter num of row:");
		Scanner  sc=new Scanner(System.in);
		int num=sc.nextInt();
		printingStar(num);

	}

	private static void printingStar(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=i;j<=num;j++) {
				System.out.print("*");
			}for(int j=2;j<=i;j++) {
				System.out.print("-");
			}for(int j=2;j<=i;j++) {
				System.out.print("-");
			}
			for(int j=i;j<=num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=i;j<num;j++) {
				System.out.print("-");
			}for(int j=i;j<num;j++) {
				System.out.print("-");
			}for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
