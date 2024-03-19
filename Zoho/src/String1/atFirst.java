package String1;
/*Given a string, return a string length 2 made of its first 2 chars. 
 * If the string length is less than 2, use '@' for the missing chars.
atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"

 * */
public class atFirst {
	public static String atFirst(String str) {
		  if(str.length()==0)return "@@";
		  return(str.length()<2)?str+"@":str.substring(0,2);
		}

	public static void main(String[] args) {
		System.out.println(atFirst("hello"));
	 	System.out.println(atFirst("hi"));
		System.out.println(atFirst("h"));

	}

}
