package Warm_Up1;
/*Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
*/

public class front3 {
	public static String front3(String str) {
		  if(str.length()==0)return str;
		  String repeat="";
		  repeat=(str.length()<3)?str:str.substring(0,3);
		  int loop=1;
		  str="" ; 
		  while(loop<=3){
		   str+=repeat;
		   loop++;
		  }
		return str;
		}
	public static void main(String[] args) {
		System.out.println(  front3("Java")  );
		System.out.println(  front3("Chocolate")  );
		System.out.println(  front3("abc")  );

	}

}
