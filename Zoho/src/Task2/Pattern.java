package Task2;

import java.util.Scanner;

public class Pattern {
	public static void DownHill(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
		
			System.out.println("Enter num of row:");
			Scanner  sc=new Scanner(System.in);
			int num=sc.nextInt();
			DownHill(num);
		}
		
		
	

}
