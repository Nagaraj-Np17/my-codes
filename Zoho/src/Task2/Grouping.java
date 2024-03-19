package Task2;

import java.util.Scanner;

public class Grouping {

	public static void main(String[] args) {
		System.out.println("Enter num to  Student:");
		Scanner  sc=new Scanner(System.in);
		int num=20;
		groupingValue(num);

	}

	public static void groupingValue(int num) {
	num=100+num;
		int  i=101;
		while(i<=num) {
			System.out.print(i+" ");
			i+=4;
		}
		i=102;
		System.out.println();
		while(i<=num) {
			System.out.print(i+" ");
			i+=4;
		}
		i=103;
		System.out.println();
		while(i<=num) {
			System.out.print(i+" ");
			i+=4;
		}
		System.out.println();
		i=104;
		while(i<=num) {
			System.out.print(i+" ");
			i+=4;
		}
		
	}

}
