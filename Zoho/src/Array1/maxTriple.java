package Array1;

import java.util.Arrays;

/*Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 * */
public class maxTriple {
	public static int maxTriple(int[] nums) {
		  int len=nums.length-1;
		  int mid=nums.length/2;
		  return nums[0]>nums[mid]?nums[0]>nums[len]?nums[0]:nums[len]:nums[mid]>nums[len]?nums[mid]:nums[len];
		}

	public static void main(String[] args) {
		int[] arr1= {1, 2, 3};
		System.out.println(maxTriple(arr1));

	}

}
