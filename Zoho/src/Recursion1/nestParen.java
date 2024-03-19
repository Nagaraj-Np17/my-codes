package Recursion1;
/*
Given a string, return true if it is a nesting of zero or more pairs of
 parenthesis, like "(())" or "((()))". 
 Suggestion: check the first and last chars, and then recur on what's 
 inside them.
nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false*/
public class nestParen {
	public static boolean nestParen(String str) {
		  if(str.equals(""))return true;
		  if(str.charAt(0)=='('&&str.charAt(str.length()-1)==')')
		    return nestParen(str.substring(1,str.length()-1))     ;
		  else
		    return false;
		  
		}

	public static void main(String[] args) {
		System.out.println(nestParen("(())"));
	 	System.out.println(nestParen("((()))"));
		System.out.println(nestParen("(((x))") );	

	}

}
