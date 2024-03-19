package AP_1;

import java.util.Arrays;

public class WordsWithout {
	public static String[] wordsWithout(String[] words, String target) {
		  int len=0;
		  for(int i=0;i<words.length;i++){
		    if(words[i]!=target){
		      len++;
		    }
		  }
		  String  str[]=new String[len];
		  int index=0;
		  for(int i=0;i<words.length;i++){
			 if(index==len)break;
		    if(words[i]!=target){
		      str[index++]=words[i];		      
		    }
		  }
		    return  str;
		}
public static void main(String []args) {
	String[]  srt= {"xx", "yyy", "x", "yy", "x", "yy"};
	String t="x";
	String res[]=wordsWithout(srt,t);
	System.out.print(Arrays.toString(res));
	}
}
