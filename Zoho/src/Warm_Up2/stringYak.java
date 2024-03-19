package Warm_Up2;
/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
*/
public class stringYak {
	public static String stringYak(String str) {
		  String res="";
		  int len=str.length();
		 for(int i=0;i<len;i++){
		   if(i<len-2&&str.charAt(i)=='y'&&str.charAt(i+1)=='a' &&str.charAt(i+2)=='k'){
		     i=i+2;}
		   else{
		     res+=str.charAt(i);
		      }
		 }
		  return res;
		}
	public static void main(String[] args) {
		System.out.println(stringYak("yakpak"));
		System.out.println(stringYak("pakyak"));
		System.out.println(stringYak("yak123ya"));
	}

}
