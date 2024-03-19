package String1;
/*
Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 * */
public class endsLy {
	public static boolean endsLy(String str) {
		  return (str.endsWith("ly")) ?true:false;
		}

	public static void main(String[] args) {
		System.out.println(endsLy("oddly"));
	 	System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));

	}

}
