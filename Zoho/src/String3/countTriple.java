package String3;
/*We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.
countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
 * */
public class countTriple {
	public static int countTriple(String str) {
		int count=0;
		for(int i=0;i<str.length()-2;i++) {
			String  triple=""+str.charAt(i)+str.charAt(i)+str.charAt(i);
			if(str.substring(i,i+3).equals(triple)) {
				count++;
			}
		}
		return count;
		  
	 }
	public static void main(String[] args) {
			System.out.println(countTriple("abcXXXabc"));
		 	System.out.println(countTriple("xxxabyyyycd"));
			System.out.println(countTriple("a"));
			
		}

}
