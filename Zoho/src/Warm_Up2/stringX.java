package Warm_Up2;
/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/
public class stringX {
	public static String stringX(String str) {
		  if(str.length()<2)return str;
		  int  len=str.length();
		  String remove=""+str.charAt(0);
		  for(int i=1;i<str.length()-1;i++){
		    if(str.charAt(i)=='x')continue;
		    remove+=str.charAt(i);
		  }
		  remove+=str.charAt(len-1);
		  return remove;
		}
	public static void main(String[] args) {
		System.out.println(stringX("xxHxix"));
		System.out.println(stringX("abxxxcd"));
		System.out.println(stringX("xabxxxcdx"));

	}

}
