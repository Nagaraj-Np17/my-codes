package Task2;

import java.util.Arrays;

public class IndexSorting {
public static void sortIndexBase(int  arr[]) {
	for(int i=0;i<arr.length;i++) 
	{
		for(int j=i+2;j<arr.length;j+=2)
		{
			if(i%2==0&&arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			else
			{
				if(i%2!=0&&arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
			}
		}
	
	}
	System.out.print(Arrays.toString(arr));
}
	public static void main(String[] args) {
		
		int arr[]= {13,2,5,11,15,7,9};
		sortIndexBase(arr);
		
		

}}
