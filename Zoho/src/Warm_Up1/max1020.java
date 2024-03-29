package Warm_Up1;
/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
*/
public class max1020 {
	public static int max1020(int a, int b) {
		  if(a>=10&&a<=20 && b>=10&& b<=20){
		    return (a<b)?b:a;
		  }
		  else{
		    if(a<10&&b>20||a>20&&b<10)return 0;
		    else if(a>=10&&a<=20||b<10||b>20)return a;
		    else if(a<10||a>20 && b>=10&&b<=20)return b;
		   return 0;
		  }
		}

	public static void main(String[] args) {
		System.out.println( max1020(11, 19) );
		System.out.println( max1020(19, 11));
		System.out.println( max1020(11, 9) );

	}

}
