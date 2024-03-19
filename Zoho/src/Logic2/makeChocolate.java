package Logic2;
/*
We want make a package of goal kilos of chocolate. 
We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always 
use big bars before small bars. Return -1 if it can't be done.
makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
 * */
public class makeChocolate {
	static int makeChocolate(int small, int big, int goal) {
		  if (small+big*5< goal) return -1;
		  else if(goal<5) return (goal<=small)?goal:-1;
		  else{
		    if(goal==(big*5))return 0;
		    int  need=goal-(big*5);
		    if(need>0){
		       return (need<=small)?need:-1;
		    }else{
		      need=goal%5;
		      return (need<=small)?need:-1;
		    }
		  }  
		}
	public static void main(String[] args) {
		System.out.println(makeChocolate(4, 1, 9));
		System.out.println(makeChocolate(4, 1, 10));
		System.out.println(makeChocolate(4, 1, 7));
	}
}
