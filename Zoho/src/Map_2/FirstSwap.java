package Map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
	public String[] firstSwap(String[] strings) {
		   Map<String, Integer> map = new HashMap();
		  for (int i = 0; i < strings.length; i++) {
		    String str= String.valueOf(strings[i].substring(0, 1));
		    if (map.containsKey(str)) {
		      int value = map.get(str);
		      if (value == -1)
		        continue;
		      int pos = map.get(str); 
		      String temp = strings[pos];
		      strings[pos] = strings[i];
		      strings[i] = temp ;
		      map.put(str, -1);
		    } else
		      map.put(str, i);
		  }
		  return strings;
		}

}
