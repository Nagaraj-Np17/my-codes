package Assignment3;
//2. Write a Java program to find the number of days in a given month and year.

import java.util.Scanner;

public class Program2 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Year:");
		 short year=sc.nextShort();
		 System.out.println("Enter the Month:");
		 byte month=sc.nextByte();
		 
		 calcDate(year,month);
		
	}

	private static void calcDate(short year, byte month) {
		byte date = 0;
		switch(month) {
		case 1: case 3:  case 5: case 7: case 8: case 10: case 12 :
			date=31;
			break;
		case 4: case 6:  case 9: case 11:
			date=30;
		case 2:
			if((year%4==0 && year%100==0 ) ||year%400==0) {
				date=29;
				break;
			}
			else {
				date=28;
				break;
			}
		default:
			System.out.print("Invalid Data");		
		
		}
		System.out.println("In"+ year +" -"+month+" Month "+"Days ="+ date);
		
		
		
		
	}
	
}
