package Array1;

import java.util.Arrays;

/*Given an array of ints of odd length, return a new array 
 * length 3 containing the elements from the middle of the array. The array length will be at least 3.
midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
 * */
public class midThree {
	public static int[] midThree(int[] nums) {
		  int mid=nums.length/2;
		  int res[]={nums[mid-1],nums[mid],nums[mid+1]};
		  return res;
		}

	public static void main(String[] args) {
		int[] arr1= {1, 2, 3, 4, 5};
		int res[]= midThree(arr1);
		System.out.println(Arrays.toString(res));
	}

}
