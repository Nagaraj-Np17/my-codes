package String2;
import java.util.Scanner;
/*
Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"

 * 
 * */
public class repeatEnd {
	public static String repeatEnd(String str, int n) {
		  String repeat=str.substring(str.length()-n);
		  String res="";  
		  while(n>0){
		  res=res+repeat;
		    n--;
		  }
		return res;
		}
	public static void main(String[] args) {
		System.out.println("Enter The String1:");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();	
		System.out.println("Enter The number to repeat:");
		int b=sc.nextInt();	
		System.out.print(repeatEnd(a,b));
	}

}
