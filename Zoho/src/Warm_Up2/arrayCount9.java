package Warm_Up2;
/*
Given an array of ints, return the number of 9's in the array.
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
*/
public class arrayCount9 {
	public static int arrayCount9(int[] nums) {
		  int  count=0;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]==9){
		    count++;
		    }
		  }
		 return count; 
		  
		}
	public static void main(String[] args) {
		int arr1[]= {1,2,9};int arr2[]= {1, 9, 9};
		int arr3[]= {1, 9, 9, 3, 9};
		System.out.println(arrayCount9(arr1));
		System.out.println(arrayCount9(arr2));
		System.out.println(arrayCount9(arr3));

	}

}
