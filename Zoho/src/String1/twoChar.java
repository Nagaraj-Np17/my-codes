package String1;
/*
Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
 * */
public class twoChar {
	public static String twoChar(String str, int index) {		 
		  if(index<0||str.length()-index<2||index>str.length()){
		    return  str.substring(0,2);}
		  
		  return str.substring(index,index+2);
		}

	public static void main(String[] args) {
		System.out.println(twoChar("java", 0));
	 	System.out.println(twoChar("java", 2));
		System.out.println(twoChar("java", 3));
	}

}
