package Recursion1;
/*
Given a string, compute recursively a new string where all the lowercase 'x' 
chars have been moved to the end of the string.
endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"*/
public class endX {
	public static String endX(String str) {
		  if(str.length()==0)return str;
		  if(str.charAt(0)!='x')return (char)(str.charAt(0))+endX(str.substring(1));
		  return endX(str.substring(1))+"x";
		}

	public static void main(String[] args) {
		System.out.println(endX("xxre"));
	 	System.out.println(endX("xxhixx"));
		System.out.println(endX("xhixhix"));

	}

}
