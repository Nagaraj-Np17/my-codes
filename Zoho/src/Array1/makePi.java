package Array1;

import java.util.Arrays;

/*
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
makePi() → [3, 1, 4]
 * */
public class makePi {
	public static int[] makePi() {
		  return new int[] {3,1,4};

		}
	public static void main(String[] args) {
		int res[]= makePi();
		System.out.println(Arrays.toString(res));
	}

}
