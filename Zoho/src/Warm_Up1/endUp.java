package Warm_Up1;
/*
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
*/
public class endUp {
	public static String endUp(String str) {
		  String result="";
		  int Upperindex=0;
		  if(str.length()<3){
		    str= str.toUpperCase();
		     return str;
		  }		  
		  for(int i=0;i<str.length()-3;i++){
		    result+=str.charAt(i);
		    }
		    String merge=str.substring(str.length()-3);
		    result+=merge.toUpperCase();
		    return result;
		  }
	public static void main(String[] args) {
		System.out.println( endUp("Hello") );
		System.out.println( endUp("hi there"));
		System.out.println( endUp("hi") );

	} 
		  
		  


}
