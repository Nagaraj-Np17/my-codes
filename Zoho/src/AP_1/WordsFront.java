package AP_1;

import java.util.Arrays;

public record WordsFront() {
	public String[] wordsFront(String[] words, int n) {
		  return Arrays.copyOf(words,n);		  
		}

}
