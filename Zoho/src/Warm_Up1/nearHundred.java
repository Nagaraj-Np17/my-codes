package Warm_Up1;
/*Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
*/ 
public class nearHundred {
	public static boolean nearHundred(int n) {
		  if(n-100>=(-10)&&n-100<=10 ||n-200>=(-10)&&n-200<=10){
		    return true;
		  }
		  return false;
		}
public static void main(String[] args) {
	System.out.println(nearHundred(93));
	System.out.println(nearHundred(90));
	System.out.println(nearHundred(89));
	}

}
