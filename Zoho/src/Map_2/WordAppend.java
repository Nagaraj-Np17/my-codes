package Map_2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
	public String wordAppend(String[] strings) {
		  Map<String, Integer> map = new HashMap();
		  String str = "";
		  
		  for(String s: strings) {
		    String key = s;
		    
		    if (map.containsKey(key)) {
		      int value = map.get(key);
		      value++;
		      if (value % 2 == 0)
		        str += key;
		      map.put(key, value);
		    } else
		      map.put(key, 1);
		  }
		  return str;
		}


	public static void main(String[] args) {
		

	}

}
