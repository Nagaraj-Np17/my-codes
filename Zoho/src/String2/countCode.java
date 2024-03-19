package String2;
import java.util.Scanner;
/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
*/
public class countCode {
	static int countCode(String str) {
		   int count=0;
		   for(int start=0;start<str.length()-3;start++){
		     int end=start+2;
		     if(str.substring(start,end).equals("co")&&str.charAt(end+1)=='e'){
		       count++;
		     };
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();	
		System.out.println(countCode(str));

	}


}
