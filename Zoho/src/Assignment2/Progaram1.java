package Assignment2;

import java.util.Scanner;

//Write a program to convert Celsius to Fahrenheit using appropriate
//datatypes and literal conventions
//F=(C×9/5​)+32
public class Progaram1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the Celsius to Convert Fahrenheit: ");
	float cel=sc.nextFloat();
	System.out.println("Fahrenheit Value of"+cel+" Celsius:"+fahrenheitConverter(cel));
}

	private static float fahrenheitConverter(float cel) {
		float convertF=(cel*9/5)+32;
		return convertF;
	}

}
