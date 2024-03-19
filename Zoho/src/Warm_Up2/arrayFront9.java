package Warm_Up2;
/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
*/
public class arrayFront9 {
	public static boolean arrayFront9(int nums[]){
		  int target=3;
		  target=(nums.length<3)?nums.length:target;
		  for(int i=0;i<target;i++){
		    if(nums[i]==9)return true;
		  }
		  return false;
		  
		}
	public static void main(String[] args) {// TODO Auto-generated method stub
		int arr1[]= {1, 2, 9, 3, 4};int arr2[]= {1, 2, 3, 4, 9};
		int arr3[]= {1, 2, 3, 4, 5};
		System.out.println(arrayFront9(arr1));
		System.out.println(arrayFront9(arr2));
		System.out.println(arrayFront9(arr3));
	}

}
