package String1;
/*Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""

 * */
public class withouEnd2 {
	public static String withouEnd2(String str) {
		  return (str.length()<=1)?"":str.substring(1,str.length()-1);
		}
	public static void main(String[] args) {
		System.out.println(withouEnd2("Hello"));
	 	System.out.println(withouEnd2("abc"));
		System.out.println(withouEnd2("ab") );


	}

}
