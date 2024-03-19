package String2;
import java.util.Scanner;
/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
 * */
public class sameStarChar {
	public static boolean sameStarChar(String str) {
		   for(int start= 1; start < str.length() - 1; start++) {
		        if(str.charAt(start)=='*' && str.charAt(start - 1) != str.charAt(start + 1)) return false;
		    }
		  return true;
		}
	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();	
		System.out.println(sameStarChar(str));
		
	}
	}

