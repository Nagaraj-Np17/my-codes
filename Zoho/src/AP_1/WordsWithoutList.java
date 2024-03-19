package AP_1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
	public List wordsWithoutList(String[] words, int len) {
		  List<String>li=new ArrayList<String>();
		  for(int i=0;i<words.length;i++){
		    String ch=words[i];
		    if(ch.length()!=len){
		      li.add(ch);
		      }
		    }
		    return li;
		}

}
