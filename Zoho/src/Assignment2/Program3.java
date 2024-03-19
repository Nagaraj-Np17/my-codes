package Assignment2;

import java.util.Scanner;

//Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations 
//on them
public class Program3 {
		public  static  void  bitwise_AND(int a,int  b) {
			System.out.println("AND\t--> a & b\t= "+ (a&b));
		}
		public  static  void  bitwise_OR(int a,int  b) {
			System.out.println("OR\t--> a | b\t= "+ (a | b));
		}
		
		public  static  void  bitwise_XOR(int a,int  b) {
			System.out.println("XOR\t--> a ^ b\t= "+ (a^b));
		}
		public  static  void  bitwise_RightShift(int a,int  b) {
			System.out.println("Left Shift-->\ta>>b/t= "+ (a>>b));
		}
		public  static  void  bitwise_LeftShift(int a,int  b) {
			System.out.println("Left Shift-->\ta<<b/t= "+ (a<<b));
		}
		
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter The value Of  A and  B");
			int a=sc.nextInt();
			int b=sc.nextInt();
			bitwise_AND(a,b);
			bitwise_OR(a,b);
			bitwise_XOR(a,b);
			bitwise_RightShift(a,b);
			bitwise_LeftShift(a,b);
			
			
		}

	
		
	}


