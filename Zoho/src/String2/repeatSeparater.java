package String2;
import java.util.Scanner;
/**
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 * 
 */
public class repeatSeparater {
	public static String repeatSeparator(String word, String sep, int count) {
		 if(count==0)return "";
		  String  res="";
		  for(int  i=count;i>1;i--){
		    res=res+word+sep;
		     }
		  return res+word;
		}
	public static void main(String[] args) {
		System.out.println("Enter The String1:");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();	
		System.out.println("Enter The number to sep:");
		String b=sc.next();	
		System.out.println("Enter The number to repeat:");
		int c=sc.nextInt();	
		System.out.print(repeatSeparator(a,b,c));
	}
}
