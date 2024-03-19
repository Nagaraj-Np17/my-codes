package String2;
import java.util.Scanner;
/*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */
public class mixString {
	public static String mixString(String a, String b) {
		  String res="";
		  int maxlen=(a.length()>b.length())?a.length():b.length();
		  for(int i=0;i<maxlen;i++){
		    if(i<a.length()){
		      res+=a.charAt(i);
		    }
		    if(i<b.length()){
		      res+=b.charAt(i);
		    }
		  }
		  
		  return res;
		}
	public static void main(String[] args) {
		System.out.println("Enter The String1:");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();	
		System.out.println("Enter The String2:");
		String b=sc.nextLine();	
		System.out.print(mixString(a,b));

	}

}
