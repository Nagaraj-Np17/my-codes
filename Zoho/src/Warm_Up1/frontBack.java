package Warm_Up1;
/*Given a string, return a new string where the first and last chars have been exchanged.
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/
public class frontBack {
	public static String frontBack(String str) {
		  int  len=str.length();
		  if(str.length()<=1){
		    return str;
		  }
		  String  result=str.charAt(len-1)+str.substring(1,len-1)+str.charAt(0);
		  return result;
		}

	public static void main(String[] args) {
		System.out.println(frontBack("code"));
		System.out.println(frontBack("a"));
		System.out.println(frontBack("ab"));
	}

}
