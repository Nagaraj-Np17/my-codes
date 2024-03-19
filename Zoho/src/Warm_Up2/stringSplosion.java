package Warm_Up2;
/*
Given a non-empty string like "Code" return a string like "CCoCodCode".
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/
public class stringSplosion {
	public static String stringSplosion(String str) {
		String res="";
		int  i=0;
		while(i<str.length()){
		  res+=str.substring(0,i+1);
		  i++;
		}
		return res;  
		}
	public static void main(String[] args) {
		System.out.println(stringSplosion("Code"));
		System.out.println(stringSplosion("abc"));
		System.out.println(stringSplosion("ab"));

	}

}
