package Warm_Up1;
/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
*/
public class close10 {
	public static int close10(int a, int b) {
		  int aten=(a>10)?a-10:10-a;int  bten=(b>10)?b-10:10-b;
		  return(aten==bten)?0:(aten>bten)?b:a;
		}
	public static void main(String[] args) {
		System.out.println( close10(8, 13));
		System.out.println( close10(13, 8));
		System.out.println( close10(13, 7) );
	}

}
