package String2;
import java.util.Scanner;
/*
Look for patterns like "zip" and "zap" in the string -- length-3,
starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 * */
public class zipZap {
	public static String zipZap(String str) {
		  int i=0;
		  String res="";
		  while(i < str.length()) {
		    if(i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
		      res+="zp";
		      i += 3;
		    } else {
		       res+=""+ str.charAt(i);
		       i++;
		        }
		    }
		    return res;
		  }
	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();	
		System.out.println(zipZap(str));	
	}
}
