package Warm_Up1;
/*
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/
public class startOz {
	public static String startOz(String str) {
		  if(str.length()==0)return "";
		  if(str.startsWith("oz"))return "oz";
		  return (str.charAt(0)=='o')?"o":(str.charAt(1)=='z')?"z":"";
		}
	public static void main(String[] args) {
		System.out.println( startOz("ozymandias"));
		System.out.println( startOz("bzoo"));
		System.out.println( startOz("oxx") );
	}

}
