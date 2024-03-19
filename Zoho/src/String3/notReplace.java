package String3;
/*Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 * */
public class notReplace {
	public static String notReplace(String str) {
		  int len=str.length();String result="";
		  for(int i=0;i<str.length();i++){
		    char c=str.charAt(i);
		    if(i-1>=0&& Character.isLetter(str.charAt(i-1))||
		    (i+2<len&& Character.isLetter(str.charAt(i+2)))){
		      result+=str.charAt(i);
		    }else if((i+1<len)&& str.substring(i,i+2).equals("is")){
		      result+="is not";
		      i++;
		    }else{
		      result+=str.charAt(i);
		    }
		  }
		    return result;
		}

	public static void main(String[] args) {
		System.out.println(notReplace("is test"));
		System.out.println(notReplace("is-is") );
		System.out.println(notReplace("This is right"));
	}
	

}
