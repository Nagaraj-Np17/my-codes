package March5;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		//System.out.println("Enter num of row:");
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter StartPoint of Line1: ");
		int s1=sc.nextInt();
		int  s2=sc.nextInt();
		
		System.out.println("StartPoint:"+s1+s2);
		System.out.println("Enter EndPoint of Line1:");
		int e1=sc.nextInt();
		int  e2=sc.nextInt();
		System.out.println("Enter StartPoint of Line2:");
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		System.out.println("Enter EndPoint of Line2:");
		int e3=sc.nextInt();
		int e4=sc.nextInt();
		int mid1=s1+e1;int mid2=s2+e2;
		int mid3=s3+e3;int mid4=s4+e4;
		
		if((mid1/2)==(mid3/2)&& (mid2/2)==(mid4/2)) {
			System.out.print("InterSected");
		}else {
			System.out.print(" Not  InterSected");
		}
		
	}

}
