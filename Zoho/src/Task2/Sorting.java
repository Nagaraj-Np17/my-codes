package Task2;

import java.util.Arrays;

public class Sorting {
	public static void incrementDecrementSort(int arr[]){
		Arrays.sort(arr);
		for(int i=0,j=arr.length-1;i<arr.length/2;i+=2,j-=2) {
			int  temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.print(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int  arr[]= {13,2,4,15,12,10,5};
		incrementDecrementSort(arr);
	}

}
