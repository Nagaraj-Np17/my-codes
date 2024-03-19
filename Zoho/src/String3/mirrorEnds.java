package String3;
/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 * */
public class mirrorEnds {	
	public static String mirrorEnds(String str) {
		int end=str.length()-1;
		String res=""; 
		for(int start=0;start<str.length();start++) {
			if(str.charAt(start)==str.charAt(end)) {
			res+=str.charAt(start);
			end--;
			}else {
				break;
			}
		}
		return res;
  }	  
	public static void main(String[] args) {
		System.out.println(mirrorEnds("abXYZba"));	
		System.out.println(mirrorEnds("abca"));
		System.out.println(mirrorEnds("aba"
				+ ""));
	}	  
		  
	}



