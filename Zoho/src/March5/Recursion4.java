package March5;

import java.util.Scanner;

public class Recursion4 {
public static boolean evaluateBrakets(String str){
    if(str.length()<1)return true;
    if(str.charAt(0)=='('&&str.charAt(str.length()-1)==')'){
        return evaluateBrakets(str.substring(1,str.length()-1));
    }
    else{return false; }   
           

}

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String:");
    String str=sc.next();
    System.out.println(evaluateBrakets(str));
    }
}
