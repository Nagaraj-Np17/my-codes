package Task2;

import java.util.Arrays;

public class LeftRotate {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},
				{13,14,15,16}};
		
		leftshift(arr);
			
		
		
		
		
		}

	private static void leftshift(int[][] arr) {
		int res[][]=new int[arr.length][arr[0].length];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr.length;col++) {
				res[arr.length-1-col][row]=arr[row][col];
			}
		}
		
		for(int i=0;i<res.length;i++) {
			System.out.print(Arrays.toString(res[i]));
			System.out.println();
		}
		
	}
	

	}


