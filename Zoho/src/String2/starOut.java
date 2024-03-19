package String2;
/*Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
*/
public class starOut {
	public static String starOut(String s) {
		  String  res="";
		    for (int i = 0; i < s.length(); i++) {
		        if (s.charAt(i) == '*') continue;
		        if (i > 0 && s.charAt(i - 1) == '*') continue;
		        if (i < s.length() - 1 && s.charAt(i + 1) == '*') continue;
		        res+=s.charAt(i);
		    }
		return res;
		}

	public static void main(String[] args) {
		System.out.println(starOut("ab*cd"));
		System.out.println(starOut("ab**cd"));
		System.out.println(starOut("sm*eilly"));

	}

}
