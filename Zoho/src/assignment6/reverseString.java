package assignment6;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		System.out.println("Enter the String to Reverse:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		reverse(str);
		
	}

	private static void reverse(String str) {
		String revStr="";
		for(int i=str.length()-1;i>=0;i--) {
			revStr+=str.charAt(i);
		}
		System.err.println(revStr);
	}

}
