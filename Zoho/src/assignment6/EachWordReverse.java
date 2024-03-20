package assignment6;

import java.util.Scanner;

public class EachWordReverse {
	
public static void main(String[] args) {
	System.out.println("Enter the String to Reverse:");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println(eachWordReverse(str));
}

private static String eachWordReverse(String str) {
	if(str.contains(" "))
	{
		int index = str.indexOf(" ");
		return eachWordReverse(str.substring(index+1)) +" "+ str.substring(0,index);
	}
	return str;
	
}
}
