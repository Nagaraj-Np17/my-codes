package Map_2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
	public Map<String, String> pairs(String[] strings) {
		   Map<String, String> map=new HashMap<>();
		  for(int i=0;i<strings.length;i++){
		    if(!map.containsKey(strings[i].charAt(0))){
		      map.put(""+strings[i].charAt(0),strings[i].charAt(strings[i].length()-1)+"");
		    }    
		  }
		  return map;
		}

}
