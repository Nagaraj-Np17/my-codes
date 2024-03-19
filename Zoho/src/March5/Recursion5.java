package March5;

import java.util.Scanner;

public class Recursion5 {
    public static String ValidString(String str) {
        if(str.length()==0) return str;
        if(str.charAt(0)=='('){
          if(str.charAt(str.length()-1)==')')         
            return str;
          else 
            return ValidString(str.substring(0,str.length()-1)); 
          }
        return  ValidString(str.substring(1));
      }

 
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String:");
    String str=sc.next();
	System.out.println(ValidString(str));
	}

  }

