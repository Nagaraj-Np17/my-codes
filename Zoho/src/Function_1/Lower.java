package Function_1;

import java.util.List;

public class Lower {
	public List<String> lower(List<String> strings) {
		  strings.replaceAll(str-> str.toLowerCase());
		  return strings;
		}
}
