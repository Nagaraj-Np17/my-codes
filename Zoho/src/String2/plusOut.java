package String2;
import java.util.Scanner;
/*Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 * */
public class plusOut {
	public static String plusOut(String str, String word) {
		  int len=word.length();String res="";
		  int  i=0;
		  while(i<str.length()){
		    if((i+len<=str.length())&&(str.substring(i,i+len).equals(word))){
		      res+=str.substring(i,i+len);
		      i=i+len;
		      continue;
		    }
		    res+="+";
		    i++;
		  }
		  return res;
		}
	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter The word:");
		String word=sc.nextLine();
		System.out.println(plusOut(str,word));
			
	}

}
