package Warm_Up1;
/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
*/ 	

public class diff21 {
	public static int diff21(int n) {
	    if(n>=21)return(2*(n-21));
	  return((n-21)*(-1));
	}
	public static void main(String[] args) {
		System.out.println(diff21(19));
		System.out.println(diff21(10));
		System.out.println(diff21(21));

	}

}
