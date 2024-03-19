package String2;
import java.util.Scanner;
/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 * 
 * */
public class xyzThere {	
	public static boolean xyzThere(String str) {
	  if(str.startsWith("xyz"))return true;				  
	  else{				    
	    for(int start=1;start<str.length()-2;start++){
	      int end=start+3;
	      if(str.substring(start,end).equals("xyz")&&str.charAt(start-1)!='.'){
	        return true;
	      }
	    }    
	    return false;
	  }
				  
	}	
	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();	
		System.out.println(xyzThere(str));
}
		
}

