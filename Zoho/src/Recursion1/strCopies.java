package Recursion1;
/*Given a string and a non-empty substring sub, compute recursively 
 * if at least n copies of sub appear in the string somewhere, possibly
 *  with overlapping. N will be non-negative.
strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true*/
public class strCopies {
	public static boolean strCopies(String str, String sub, int n) {
		  if(str.length()==0)return n<=0;
		  if(sub.length()-1<str.length()){
		    if(str.substring(0,sub.length()).equals(sub)){
		      return strCopies(str.substring(1,str.length()), sub, n-1);
		      
		    }
		    return strCopies(str.substring(1,str.length()), sub, n);
		  }
		  return n<=0;
		  
	}
	public static void main(String[] args) {
		System.out.println(strCopies("catcowcat", "cat", 2));
	 	System.out.println(strCopies("catcowcat", "cow", 2));
		System.out.println(strCopies("catcowcat", "cow", 1));
	}

}
