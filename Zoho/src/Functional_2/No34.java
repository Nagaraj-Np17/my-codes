package Functional_2;

import java.util.List;

public class No34 {
	public List<String> no34(List<String> strings) {
		  strings.removeIf(str->(str.length()==3 ||  str.length()==4));
		  return strings;
		}

}
