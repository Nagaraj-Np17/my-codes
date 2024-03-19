package Logic1;
/*
Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
less20(18) → true
less20(19) → true
less20(20) → false
 * */
public class less20 {
	public static boolean less20(int n) {
		  if((n<20)&& (20-n==1) ||(20-n==2)){
		    return true;
		  }
		  else{
		    if(n%20==18||n%20==19){
		      return true;
		    }
		     return false;
		  }
		 
		}
	public static void main(String[] args) {
		System.out.println(less20(18));
		System.out.println(less20(19));
		System.out.println(less20(20));

	}

}
