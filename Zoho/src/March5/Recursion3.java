package March5;

import java.util.Scanner;

/*
 */
public class Recursion3 {
    public static int powerN(int base, int n) {
        if(n==1)return base;
        return base*powerN(base,n-1);
      }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Base:");
    int base=sc.nextInt();
    System.out.println("Enter the Power:");
    int pr=sc.nextInt();
    System.out.println(powerN(base, pr));
     }
}
