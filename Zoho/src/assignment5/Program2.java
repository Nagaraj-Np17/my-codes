package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {
	public static int[][] arrayTransport(int [][]arr){
		int [] []transport=new int [arr.length][arr.length];
		int row=0;
		for(int i=0;i<arr.length;i++) {
			int col=0;
			for(int j=0;j<arr.length;j++) {
				transport[row][col++]=arr[j][i];
			}
			row++;
		}
		return transport;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
	array=arrayTransport(array);
	for(int i=0;i<array.length;i++) {
		System.out.println(Arrays.toString(array[i]));
	}
	
	
	
	}
}
