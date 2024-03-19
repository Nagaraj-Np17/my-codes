package Task2;

import java.util.Scanner;

public class HillDown {

	public static void main(String[] args) {
		System.out.println("Enter num of row:");
		Scanner  sc=new Scanner(System.in);
		int num=sc.nextInt();
		DownHill(num);

	}

	private static void DownHill(int n) {
		int p=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
				System.out.print(p+" ");
			}for(int j=i;j<=n;j++) {
				System.out.print(p+" ");
			}
			p--;
			System.out.println();
		}
		
	}

}
