package Function_1;

import java.util.List;

public class MoreY {
	public List<String> moreY(List<String> strings) {
		  strings.replaceAll(str-> "y" +str  + "y");
		  return strings;
		}

}
