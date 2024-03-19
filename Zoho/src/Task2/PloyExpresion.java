package Task2;

import java.util.Scanner;

public class PloyExpresion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A Value:");
		float  a=sc.nextFloat();
		System.out.println("Enter the b Value:");
		float  b=sc.nextFloat();
		System.out.println("Enter the c Value:");
		float  c=sc.nextFloat();
		
		evaluteEquation(a,b,c);
	}

	private static void evaluteEquation(float a, float b, float c) {
		float  sq=(b*b)-4*a*c;	double res=0;	
		if(sq<0) {
			System.out.println("No  root");
		}
		else if(sq==0) {
			res=(-b)/(2*a);
			System.out.println(res);
		}
		else {
		double root1=(-b)+Math.sqrt(sq)/2*a;
		double root2=(-b)-Math.sqrt(sq)/2*a;
		System.out.println(root1);
		System.out.println(root2);
		}
	}

}
