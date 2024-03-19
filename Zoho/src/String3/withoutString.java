package String3;
/**Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 */
public class withoutString {
	public static String withoutString(String base, String remove) {
		 String result = "";int len=remove.length();
				for(int i = 0; i < base.length(); i++){
					if((i+len)<=base.length()&&(base.substring(i,i+len).equalsIgnoreCase(remove))){
				      i=i+len-1;
					 }else {
					   result+=base.charAt(i);
					 }
				 }
				   return result;
		}
	public static void main(String[] args) {
		 System.out.println(withoutString("Hello there", "llo"));
		 System.out.println(withoutString("Hello there", "e") );
		 System.out.println(withoutString("Hello there", "x"));
		}

}
