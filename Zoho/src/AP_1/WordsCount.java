package AP_1;

public class WordsCount {
	public int wordsCount(String[] words, int len) {
		  int  count=0;
		  for(int i=0;i<words.length;i++){
		    String str=words[i];
		    if(str.length()==len){
		      count++;
		    }
		  }
		  
		  return count;
		}

}
