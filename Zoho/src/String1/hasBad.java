package String1;
/*Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
 *  such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. 
 *  Note: use .equals() to compare 2 strings.
hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 * */
public class hasBad {
	public static boolean hasBad(String str) {
		  if(str.length()<=2)return false;
		  if(str.startsWith("bad"))return true;
		  String sub=(str.length()>3)?str.substring(1):str;
		  return (sub.startsWith("bad"))?true:false;
		}
	public static void main(String[] args) {
		System.out.println(hasBad("badxx"));
	 	System.out.println(hasBad("xbadxx"));
		System.out.println(hasBad("xxbadxx") );

	}
}
