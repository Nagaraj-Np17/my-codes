package String3;
/*
Given a string, return the longest substring that appears at both the beginning and end 
of the string without overlapping. For example, sameEnds("abXab") is "ab".
sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 * */
public class sameEnds {
	public static String sameEnds(String str) {
		 int start=0,end=str.length();String res="";
		   for(int i=1;i<=str.length()/2;i++){
			    if(str.substring(0,i).equals(str.substring(end-i))){
			      String curStr=str.substring(end-i);
			      res=(curStr.length()>res.length())?curStr:res;
		      }
		     }
		   
		return res;
	}
	public static void main(String[] args) {
	System.out.println(sameEnds("abXYab"));
	System.out.println(sameEnds("xx"));	
	System.out.println(sameEnds("xxx"));	
	}

}
