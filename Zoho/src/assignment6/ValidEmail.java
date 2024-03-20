package assignment6;

import java.util.Scanner;

public class ValidEmail {

	public static void main(String[] args) {
		System.out.println("Enter the Email to Verify:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		validation(str);

	}

	private static void validation(String str) {
		if(str.indexOf("@")!=-1) {
			if(str.indexOf("@")>3 && str.indexOf("@")+4<=str.indexOf(".co")
					||str.indexOf("@")+4<=str.indexOf(".in")) {
				System.out.println("Valid Email");
				
			}else {
				System.out.println("Invalid Email");
				
			}
		}else {
			System.out.println("Invalid Email");
			
		}
	}

}
