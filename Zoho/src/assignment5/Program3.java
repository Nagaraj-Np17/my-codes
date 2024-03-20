package assignment5;

import java.util.Arrays;

public class Program3 {
	public static void main(String[] args) {
		int arr1[][]= {{1,2,-1},{3,2,0},{-4,0,2}};
		int arr2[][]= {{3,4,2},{0,1,0},{-2,0,1}};
		int arrMultiple[][]=new int [arr1.length][arr1.length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				for(int k=0;k<arr1.length;k++) {
					arrMultiple[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		for(int i=0;i<arrMultiple.length;i++) {
			System.out.println(Arrays.toString(arrMultiple[i]));
		}
	}
	
}
