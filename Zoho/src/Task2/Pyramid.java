package Task2;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		System.out.println("Enter num of row:");
		Scanner  sc=new Scanner(System.in);
		int num=sc.nextInt();
		IncreasingPyramid(num);
		
		
		
		
	}

	private static void IncreasingPyramid(int num) {
		int value=1;
		for(int  i=1;i<=num;i++) {
			for(int  j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(value++ +" ");
			}
			
			System.out.println();
		}
		
	}

}
