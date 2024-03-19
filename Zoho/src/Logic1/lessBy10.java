package Logic1;
/*Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
 * 
lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
 * */
public class lessBy10 {
	public static boolean lessBy10(int a, int b, int c) {
		  int max=(a>b)?(a>c)?a:c:(b>c)?b:c;
		  if(max-a>=10||max-b>=10||max-c>=10){
		    return true;
		  }
		  return false;
		}

	public static void main(String[] args) {
		System.out.println(lessBy10(1, 7, 11));
		System.out.println(lessBy10(1, 7, 10));
		System.out.println(lessBy10(11, 1, 7));

	}

}
