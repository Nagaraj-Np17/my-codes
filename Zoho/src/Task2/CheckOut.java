package Task2;

import java.util.Scanner;

public class CheckOut {
public static void evaluate(int a,int  b) {
	int t1=a;int t2=b;
	System.out.println("++a-b– ="+ (++a-b--) );
	a=t1;b=t2;
	System.out.println("a%b++  ="+ (a%b++ ) );
	a=t1;b=t2;
	System.out.println("a*=b+5 ="+ (a*=b+5) );
	
	int x;
	System.out.println("x=69>>>2="+ (x=69>>>2) );
	
}
	public static void main(String[] args) {
	//++a-b–                   ii)a%b++     iii)a*=b+5iv)x=69>>>2
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Values");
		int  a=sc.nextInt();
		int  b=sc.nextInt();
		evaluate(a,b);
		
		
		
	}

}
