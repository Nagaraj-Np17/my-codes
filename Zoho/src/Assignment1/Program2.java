package Assignment1;

import java.util.Scanner;

public class Program2 {
	enum WEEKDAY {
		SUNDAY,MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of the Day:");
		int numDay = sc.nextInt();
		if (numDay < 1 && numDay > 7) {
			System.out.println("Invalid Number");
		} else {
			System.out.println(WEEKDAY.values()[numDay - 1]);
		}

	}

}