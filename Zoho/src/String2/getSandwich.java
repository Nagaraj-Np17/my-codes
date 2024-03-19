package String2;
import java.util.Scanner;
/*
A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
*/
public class getSandwich {
	public static String getSandwich(String str) {
		   int count=0;
		    if(str.length()<=10)return "";
				  for(int  i=0;i<str.length()-5;i++){
				    if(str.substring(i,i+5).equals("bread")){
				      int start=i+5;int end=str.length()-5;
				      while(end>start){
				        if(str.substring(end,end+5).equals("bread")){
				          return ""+str.substring(start,end);}
				          end--;
				      }
				     if(str.substring(end,end+5).equals("bread"))return ""+str.substring(start,end);
				    }
				  }
		  return "";
	}
	public static void main(String[] args) {
		System.out.println("Enter The String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();	
		System.out.println(getSandwich(str));

	}
}
