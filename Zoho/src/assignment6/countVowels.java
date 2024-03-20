package assignment6;

import java.util.Scanner;

public class countVowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String:");
		String str=sc.nextLine();
		int count=noOfVowels(str);
		System.out.println("Total Number Of Vowel:"+count);
		
		}

	private static int noOfVowels(String str) {
		int count=0;
		String vowels="aeiouAEIOU";
		for(int i=0;i<str.length();i++) {
			if(vowels.indexOf(str.charAt(i))!= -1){
				count++;
			}
		}
		return count;
	}
	
}
