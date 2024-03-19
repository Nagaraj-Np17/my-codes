package String1;
/*
Given a string, return a version without the first 2 chars. 
Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
The string may be any length. Harder than it looks.
deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 * */
public class deFront {
	public static String deFront(String str) { 
		  int  end=1;
		  if(str.length()<1)return "";
		  if(end<str.length()&&str.charAt(0)=='a'&& str.charAt(1)=='b'){
		    return str.substring(0);
		  }else if(str.charAt(0)=='a'){
		    return str.charAt(0)+str.substring(end+1);
		  }else  if(str.charAt(1)=='b'){
		     return str.substring(1);
		  }
		 return str.substring(end+1);
		}

	public static void main(String[] args) {
		System.out.println(deFront("Hello"));
	 	System.out.println(deFront("ab"));
		System.out.println(deFront("away"));

	}

}
