package String2;
import java.util.Scanner;
/*Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 * */
public class xyzMiddle {
public static boolean xyzMiddle(String str) {
		  int mid=str.length()/2;
		  int  start=mid-1;int end=mid+2;
		  if(str.length()%2 == 0) {
			  return(str.substring(start,end).equals("xyz") ||str.substring(start-1,end-1).equals("xyz"));
		    }
		    return str.substring(start,end).equals("xyz");
		}
public static void main(String[] args) {
	System.out.println("Enter The String:");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();	
	System.out.println(xyzMiddle(str));

	}
		  
}
		  


