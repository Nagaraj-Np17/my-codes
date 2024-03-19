package String1;
/*Given an "out" string length 4, such as "<<>>", and a word, return a 
 * new string where the word is in the middle of the out string, 
 * e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 * */
public class makeOutWord {
	public static String makeOutWord(String out, String word) {
		  int n=out.length()/2;
		  return out.substring(0,n)+word+out.substring(n);
		}
	public static void main(String[] args) {
		System.out.println(makeOutWord("<<>>", "Yay"));
	 	System.out.println(makeOutWord("<<>>", "WooHoo"));
		System.out.println(makeOutWord("[[]]", "word"));

	}
}
