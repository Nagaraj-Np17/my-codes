package Warm_Up1;
/*Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
*/ 
public class notString {
	public static String notString(String str) {
		  if(str.startsWith("not"))return str;
		  String  result="not";
		  return result+" "+str;
		}
	public static void main(String[] args) {
		System.out.println(notString("candy"));
		System.out.println(notString("x"));
		System.out.println(notString("not bad"));

	}

}
