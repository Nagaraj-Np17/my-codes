package String2;
import java.util.Scanner;
/*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 * */
public class xyBalance {
	public static boolean xyBalance(String str) {
		for(int  i=str.length()-1;i>=0;i--){
		    if(str.charAt(i)=='y'){
		      return true;}
		    else if((str.charAt(i)=='x')&&(str.charAt(i)!='y')){
		      return false;
		    }
		  }return true;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();	
		System.out.println(xyBalance(str));
	}
}
