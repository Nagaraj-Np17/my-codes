package AP_1;

public class ScoreUp {
	public int scoreUp(String[] key, String[] answers) {
	    int  start=0;int count=0;int  res=0;
	  while(start<key.length){
	    if(answers[start].equals("?")){
	      start++;
	      continue;
	    }
	    if(key[start].equals(answers[start])){
	      res+=4;;
	    }
	    else{
	      res-=1;
	    }
	    start++;
	    
	  }return res;
	}

}
