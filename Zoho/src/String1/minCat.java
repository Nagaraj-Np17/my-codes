package String1;
/*
Given two strings, append them together (known as "concatenation") and return the result.
 However, if the strings are different lengths, omit chars from the longer string so 
 it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
 * */
public class minCat {
	public static String minCat(String a, String b) {
		  if(a.length()>b.length()){
		   int  min=b.length();
		    return ""+a.substring(a.length()-min)+b;
		  }else{
		   int  min=a.length();
		    return ""+a+b.substring(b.length()-min);
		  }
		}
	public static void main(String[] args) {
		System.out.println(minCat("Hello", "Hi"));
	 	System.out.println(minCat("Hello", "java"));
		System.out.println(minCat("java", "Hello"));


	}

}
