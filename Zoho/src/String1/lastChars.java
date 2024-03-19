package String1;
/*
Given 2 strings, a and b, return a new string made of the first char of a and 
the last char of b, so "yo" and "java" yields "ya". If either string is length 0,
 use '@' for its missing char.
lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"

 * */
public class lastChars {
	public static String lastChars(String a, String b) {
		  int alen=a.length();int blen=b.length();
		  if(alen==0&&blen==0) return "@@";
		  else if(alen==0&&blen>0)return "@"+b.charAt(b.length()-1);
		  else if(alen>0&&blen==0)return a.charAt(0)+"@";
		  return ""+a.charAt(0)+b.charAt(b.length()-1);
		}

	public static void main(String[] args) {
		System.out.println(lastChars("last", "chars"));
	 	System.out.println(lastChars("yo", "java"));
		System.out.println(lastChars("hi", ""));

	}

}
