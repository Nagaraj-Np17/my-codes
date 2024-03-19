package Warm_Up2;
/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/
public class altPairs {
	public static String altPairs(String str) {
		  if(str.length()<2)return str;
		  String res=str.substring(0,2);
		  int  i=2;int prod=2;
		 for(i=4;i<str.length();i+=4){
		    res+=str.charAt(i);
		    if((i+1)<str.length()) res+=str.charAt(i+1);
		  }
		 return res;
		}

	public static void main(String[] args) {
		System.out.println(altPairs("kitten"));
		System.out.println(altPairs("Chocolate"));
		System.out.println(altPairs("CodingHorror"));
	}

}
