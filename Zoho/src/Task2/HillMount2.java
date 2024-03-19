package Task2;

import java.util.Scanner;

public class HillMount2 {

	public static void main(String[] args) {
		System.out.println("Enter num of row:");
		Scanner  sc=new Scanner(System.in);
		int num=sc.nextInt();
		decreasingHillMount(num);

	}

	private static void decreasingHillMount(int num) {
		for(int  i=1,k=9;i<=num;i++) {
			int p=k;
			for(int  j=i;j<num;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(p++ +" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(p-- +" ");
			}
			k--;
			System.out.println();
		}
		
	}

}
