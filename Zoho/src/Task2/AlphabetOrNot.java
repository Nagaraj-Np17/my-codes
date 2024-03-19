package Task2;

import java.util.Scanner;

public class AlphabetOrNot {
	public static boolean letterOrNot(char c) {
		return Character.isAlphabetic(c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        // Read a single character from the user
        char ch = sc.next().charAt(0);
System.out.println(letterOrNot(ch));
	}

}
