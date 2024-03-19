package String2;
import java.util.Scanner;
/*
Given a string and a non-empty word string, 
return a string made of each char just before and 
just after every appearance of the word in the string. 
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 * */
public class wordEnds {
	public static String wordEnds(String str, String word) {
		  int len=word.length();int i=0;String res="";
		  while(i<str.length()-len){
		    String check=str.substring(i,i+len+1);
		    if(((i+len+1)<=str.length())&&(check.startsWith(word))){
		      res+=str.charAt(i+len);
		      i++;
		    }
		    else if(((i+len+1)<=str.length())&&(check.endsWith(word))){
		      res+=str.charAt(i);
		      i++;
		    }
		    else{
		      i++;
		    }
		  }
		  if((len==1)&&str.charAt(str.length()-2)==str.charAt(str.length()-1)){
		    res+=str.charAt(str.length()-1);
		  }
		  return res;
	}

	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter The word:");
		String word=sc.nextLine();
		System.out.println(wordEnds(str,word));

	}

}
