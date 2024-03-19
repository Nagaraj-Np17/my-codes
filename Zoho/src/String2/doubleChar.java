package String2;
import java.util.Scanner;
/*Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
*/
public class doubleChar {
	static String doubleChar(String str) {
		  String res="";
		  for(int i=0;i<str.length();i++){
		    res+=str.charAt(i);
		     res+=str.charAt(i);
		  }
		  return res;
		}
public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();	
		System.out.println(doubleChar(str));
	}

}
