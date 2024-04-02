package exceptionhandling;

import java.util.Scanner;

public class ZeroDivision {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		System.out.print(5/0);
	}catch(ArithmeticException e){
		System.out.println("Cannot Divide Number The With Zero..");		
		
	}
	
	
}
}
