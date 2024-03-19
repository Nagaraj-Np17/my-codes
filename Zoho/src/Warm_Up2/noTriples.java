package Warm_Up2;
/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
*/
public class noTriples {
	public static boolean noTriples(int[] nums) {
		  int len=nums.length;
		 for(int i=0;i<nums.length;i++){
		   if(i<len-2&& nums[i]==nums[i+1] && nums[i]==nums[i+2]){
		     return false;}
		 }
		 return true;
		}
	public static void main(String[] args) {
		int arr1[]= {1, 1, 2, 2, 1};
		int arr2[]= {1, 1, 2, 2, 2, 1};
		int arr3[]= {1, 1, 1, 2, 2, 2, 1};
		System.out.println(noTriples(arr1));
		System.out.println(noTriples(arr2));
		System.out.println(noTriples(arr3));

	}

}
