package Task2;

import java.util.Arrays;

public class AlternateSorting {
	public static void alternateSort(int  arr[]) {
		int end=arr.length-1;int start=0;int  index=0;
		int  res[]=new int[arr.length];
		while(start<end) {
			res[index++]=arr[end--];
			res[index++]=arr[start++];
		}
		if(arr.length%2!=0) {
			res[index]=arr[start];
		}
		System.out.print(Arrays.toString(res));
	}
	
	public static void main(String[] args) {
		int  arr[]= {1,2,3,4,5,6,7};
		alternateSort(arr);
	}

}
