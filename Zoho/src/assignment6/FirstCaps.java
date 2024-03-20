package assignment6;

import java.util.Scanner;

public class FirstCaps {

	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		toCaps(str);

	}

	private static void toCaps(String string) {
		String res="";
		for(int i=0;i<string.length();i++) {
			if(i==0) {
				res+=Character.toUpperCase(string.charAt(i));
			}
			else if(i<string.length()-1 &&string.charAt(i)== ' '&& Character.isAlphabetic(string.charAt(i+1))) {
				res+=" "+Character.toUpperCase(string.charAt(i+1));
				i++;
			}
			else{
				res+=string.charAt(i);
			}
		}
		System.out.println(res);
	}

	

}
