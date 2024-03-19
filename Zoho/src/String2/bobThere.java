package String2;
import java.util.Scanner;
/*
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
*/
public class bobThere {	
	public static  boolean bobThere(String str) {
		for(int start=0;start<str.length()-2;start++){
			  int  end=start+2;
			  if(str.charAt(start)==str.charAt(end)){
			    return true;
			  }
			}return false;	  
	}
	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();	
		System.out.println(bobThere(str));
	}

}
