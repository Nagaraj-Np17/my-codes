package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MobileVerification {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
		System.out.println("Enter The Phone Number:");
		long phone_No=sc.nextLong();
		}
		catch(InputMismatchException e) {
			System.out.println("Mobile Number Contains Only Number..");
		}
	}

}
