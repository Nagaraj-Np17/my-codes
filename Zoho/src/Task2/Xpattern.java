package Task2;

import java.util.Scanner;

public class Xpattern {

	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner  sc=new Scanner(System.in);
		String str=sc.nextLine();
		printX(str);

	}

	private static void printX(String  str) {
		for(int i=1;i<=str.length();i++) {
			for(int j=1;j<=str.length();j++) {
				if(i==j) {
					System.out.print(str.charAt(i-1));
				}
				else if(i+j==str.length()+1) {
					System.out.print(str.charAt(str.length()-i));
				}else {
					System.out.print(" ");
					}
			}
			System.out.println();		
		}
		
	}

}
