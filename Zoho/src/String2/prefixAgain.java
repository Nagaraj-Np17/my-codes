package String2;
import java.util.Scanner;
/*
Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 * */
public class prefixAgain {
	public static boolean prefixAgain(String str, int n) {
			String prefix = str.substring(0, n);
		     for(int start= n;start<=str.length()-n; start++) {
		    	int end=start+n;
		    	if(str.substring(start,end).equals(prefix))
		            return true;
		    }
		    return false;
		}
	public static void main(String[] args) {
		System.out.println("Enter The String1:");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();	
		System.out.println("Enter The number to repeat:");
		int b=sc.nextInt();	
		System.out.print(prefixAgain(a,b));
	}
}
