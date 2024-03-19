package Warm_Up2;
/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
*/
public class stringMatch {
	public static int stringMatch(String a, String b) {
		  int minlength=(a.length()>b.length())?b.length():a.length();
		  int count=0;int start=0;
		  for(int  end=2;end<=minlength;end++){
		   String amatch=a.substring(start,end); String bmatch=b.substring(start,end);
		    if(amatch.compareTo(bmatch)==0){
		      count++;
		    }
		   start++;
		  }
		  return count;
		}
	public static void main(String[] args) {
		System.out.println(stringMatch("xxcaazz", "xxbaaz"));
		System.out.println(stringMatch("abc", "abc"));
		System.out.println(stringMatch("abc", "axc"));

	}
}
