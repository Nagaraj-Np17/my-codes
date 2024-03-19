package Task2;

import java.util.Arrays;

public class Merging {

	public static void main(String[] args) {
int arr1[]= {2,4,5};
int arr2[]= {2,3,4};
int last=0;
int index1=0,index2=0;int temp=0;int merge[]=new int[arr1.length+arr2.length];
	while(index1<arr1.length &&index2<arr2.length) 
	{
		if(arr1[index1]<=arr2[index2]) 
		{
			if(temp==0||arr1[index1]!=last)
			{
				merge[temp++]=arr1[index1];
				last=arr1[index1];
			}
			index1++;
			
		}
		else 
		{
			if(temp==0 ||arr2[index2]!=last)
			{
				merge[temp++]=arr2[index2];
				last=arr2[index2];
			}
			index2++;
		}
	}
while(index1<arr1.length) {
	if(arr1[index1]!=last) {
		merge[temp++]=arr1[index1++];
	}
	
}
while(index2<arr2.length) {
	if(arr2[index2]!=last) {
		merge[temp++]=arr2[index2++];
	}
}
int  res[]=Arrays .copyOf(merge, temp);
	System.out.println(Arrays.toString(res));


	}

}
