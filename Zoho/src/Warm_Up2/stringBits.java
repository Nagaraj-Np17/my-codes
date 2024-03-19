package Warm_Up2;
/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
*/
public class stringBits {
	public static String stringBits(String str) {
		  String res="";
		  for(int i=0;i<str.length();i++){
		    res+=str.charAt(i);
		    i++;
		  }
		  return res;
		}
	public static void main(String[] args) {
		System.out.println( stringBits("Hello"));
		System.out.println( stringBits("Hi"));
		System.out.println( stringBits("Heeololeo"));

	}

}
