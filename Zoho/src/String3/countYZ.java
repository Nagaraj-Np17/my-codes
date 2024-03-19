package String3;
/*Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
 * */
public class countYZ {
public static int countYZ(String str) {
		  int  count=0;
		  for(int i=1;i<str.length();i++){
		    char c=str.charAt(i);
		    if(!Character.isLetter(c)){
		      if(str.charAt(i-1)=='y'||str.charAt(i-1)=='z'
		      ||str.charAt(i-1)=='Z'||str.charAt(i-1)=='Y')count++;
		    }
		    }
		  if(str.charAt(str.length()-1)=='y'||str.charAt(str.length()-1)=='z'||
		 str.charAt(str.length()-1)=='Z'||str.charAt(str.length()-1)=='Y')count++;
		  
		  return count;
	}
public static void main(String[] args) {
	System.out.println(countYZ("fez day"));
	System.out.println(countYZ("day fez"));
	System.out.println(countYZ("day fyyyz"));
}
}
