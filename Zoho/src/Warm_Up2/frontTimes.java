package Warm_Up2;
/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
*/
public class frontTimes {
	public static String frontTimes(String str, int n) {
		  if(str.length()==0)return str;
		  String  res=(str.length()>3)?str.substring(0,3):str;
		  str="";
		  while(n>=1){
		    str+=res;
		    n--;
		  }
		  return str;
		}

	public static void main(String[] args) {
		System.out.println( frontTimes("Chocolate", 2));
		System.out.println( frontTimes("Chocolate", 3));
		System.out.println( frontTimes("Abc", 3));
	}

}
