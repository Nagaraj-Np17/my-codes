package String1;
/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string,
 such as with "edited".
frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 * */
public class frontAgain {
	public static boolean frontAgain(String str) {
		  if(str.length()<2)return false;
		  if(str.length()==2)return true;
		  int  start=2;int end=str.length()-2;
		  return (str.substring(0,start).equals(str.substring(end)))? true:false;
		  
		}

	public static void main(String[] args) {
		System.out.println(frontAgain("edited"));
	 	System.out.println(frontAgain("edit") );
		System.out.println(frontAgain("ed"));

	}

}
