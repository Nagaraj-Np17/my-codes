package Task2;
import java.util.Scanner;
public class Printing_Alphabets {
	private static void printAlphabet(char charAt) {
		for(char i=charAt;i<='z';i++) {
			System.out.print(i);
		}
	}
	public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	System.out.println("Enter The starting character :");
	String s=sc.next();
	printAlphabet(s.charAt(0));
	}

}
