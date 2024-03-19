package Task2;

import java.util.Scanner;

public class BitwiseOperators {
	public  static  void  bitwise_AND(int a,int  b) {
		System.out.println("a & b"+ (a&b));
	}
	public  static  void  bitwise_OR(int a,int  b) {
		System.out.println("a | b"+ (a | b));
	}
	public  static  void  bitwise_NOT(int a) {
		System.out.println("~a"+ ~a);
	}
	public  static  void  bitwise_XOR(int a,int  b) {
		System.out.println("a^b"+ (a^b));
	}
	public  static  void  bitwise_RightShift(int a,int  b) {
		System.out.println("a>>b"+ (a>>b));
	}
	public  static  void  bitwise_LeftShift(int a,int  b) {
		System.out.println("a<<b"+ (a<<b));
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The value Of  A and  B");
		int a=sc.nextInt();
		int b=sc.nextInt();
		bitwise_AND(a,b);
		bitwise_OR(a,b);
		bitwise_NOT(a);
		bitwise_XOR(a,b);
		bitwise_RightShift(a,b);
		bitwise_LeftShift(a,b);
		
		
	}

}
