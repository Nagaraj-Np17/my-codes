package String2;
import java.util.Scanner;
/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/
public class endOther {
public static boolean endOther(String a, String b) {
		String  end="";
	  	a=a.toLowerCase();b=b.toLowerCase();
			if(a.length()<b.length()) {
				if(b.substring(b.length()-a.length()).equals(a)) {return true;}
			}else {
				if(a.substring(a.length()-b.length()).equals(b)){return true;}		}
				return false;
	}
public static void main(String[] args) {
	System.out.println("Enter The String1:");
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();	
	System.out.println("Enter The String2:");
	String b=sc.nextLine();	
	System.out.print(endOther(a,b));

}

}
