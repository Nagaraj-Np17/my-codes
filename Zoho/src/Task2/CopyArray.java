package Task2;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int arr[]= {2,3,1,4};
		copyOfArray(arr);
	}

	private static void copyOfArray(int[] arr) {
		int copy[]=arr;
		System.out.print("Copied  Array:"+Arrays.toString(copy));;
		
		
		
	}

}
