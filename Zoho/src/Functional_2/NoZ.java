package Functional_2;

import java.util.List;

public class NoZ {
	public List<String> noZ(List<String> strings) {
		  strings.removeIf(str -> str.contains("z"));
		  return strings;

		}

}
