package String2;
import java.util.Scanner;
/*Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
*/
public class countHi {
	static int countHi(String str) {
		  int count=0;
		  for(int i=0;i<str.length()-1;i++){
		    if(str.charAt(i)=='h'&& str.charAt(i+1)=='i'){
		      count++;
		    }
		  }
		  return count;
		}
	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();	
		System.out.println(countHi(str));
		

	}

}
