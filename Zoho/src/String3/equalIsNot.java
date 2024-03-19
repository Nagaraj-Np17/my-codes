package String3;
/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 * 
 */
public class equalIsNot {
	public static boolean equalIsNot(String str) {
		int resCount=0;
		  for(int i=0;i<str.length();i++){
			   if(i+2<=str.length() && str.substring(i,i+2).equals("is")) {
		    	resCount++;
		    	i++;
		    }
		   else if(i+3<=str.length() && str.substring(i,i+3).equals("not")) {
		    	resCount--;
		    	i+=2;
		    }
		    
		  }
		 	return (resCount==0)?true:false;
		  }
	public static void main(String[] args) {
		System.out.println(equalIsNot("This is not"));
		System.out.println(equalIsNot("This is notnot"));
		System.out.println(equalIsNot("noisxxnotyynotxisi"));
	}

}
