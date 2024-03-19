package String1;
/*
Given a string of any length, return a new string where the last 2 chars, if present,
 are swapped, so "coding" yields "codign".
lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 * */
public class lastTwo {
	public static String lastTwo(String str) {
		  if(str.length()<2)return str;
		  
		  int len=str.length();
		  
		  return str.substring(0,len-2)+str.charAt(len-1)+str.charAt(len-2);
		}

	public static void main(String[] args) {
		System.out.println(lastTwo("coding") );
	 	System.out.println(lastTwo("cat"));
		System.out.println(lastTwo("ab"));

	}

}
