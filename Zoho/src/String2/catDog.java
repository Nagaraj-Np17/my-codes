package String2;
import java.util.Scanner;
/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.
catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
*/
public class catDog {
	public static boolean catDog(String str) {
		  if(str.length()<2)return true;
		  int  catC=0;int dogC=0;
		  for(int start=0;start<str.length()-2;start++){
		    int end=start+3;
		   if((str.substring(start,end).equals("cat"))){
		      catC++;
		    }else if((str.substring(start,end).equals("dog"))){
		      dogC++;
		    }
		   }
		  
		  if(catC==dogC){return true;}
		  return false;
	  }
	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();	
		System.out.println(catDog(str));

	}


}
