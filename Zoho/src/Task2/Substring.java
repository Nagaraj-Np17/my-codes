package Task2;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	System.out.println("Enter The String 1:");
	String str=sc.nextLine();
	System.out.println("Enter The string2:");
	String sub=sc.nextLine();
	System.out.println(subStringIndex(str,sub));

	}

	public static int subStringIndex(String str, String sub) {
		int subLen=sub.length();
		for(int i=0;i<str.length();i++) {
			if(i+subLen<=str.length()&&str.substring(i,i+subLen).equals(sub)){
				return i;
			};
		}
	return -1;
	}

}
