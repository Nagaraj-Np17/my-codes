package Warm_Up2;
/*
Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
*/
public class array667 {
	public static int array667(int[] nums) {
		  int count=0;
		  for(int i=0;i<nums.length-1;i++){
		    if(nums[i]==6){
		      if( nums[i+1]==6 || nums[i+1]==7){
		        count++;
		        }
		      }
		  }
		  return count;
		}
	public static void main(String[] args) {
		int arr1[]= {6, 6, 2};
		int arr2[]= {6, 6, 2, 6};
		int arr3[]= {6, 7, 2, 6};
		System.out.println(array667(arr1));
		System.out.println(array667(arr2));
		System.out.println(array667(arr3));

	}

}
