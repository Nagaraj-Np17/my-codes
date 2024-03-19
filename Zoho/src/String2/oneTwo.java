package String2;
import java.util.Scanner;
/*
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 * */
public class oneTwo {
	public static String oneTwo(String str) {
		  if(str.length()<2)return "";
		  String res=""; char add=str.charAt(0) ;
		  int len=str.length()%3;
		  for(int i=1;i<str.length()-len;i++){
		    res+=str.charAt(i);
		    if((i+1)%3==0){
		      res+=add;
		     if(i+1<str.length())add=str.charAt(i+1);
		      i=i+1;
		    }
		  
		  }
		  return res;  
		}
	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();	
		System.out.println(oneTwo(str));
	}
}
