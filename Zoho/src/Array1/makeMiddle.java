package Array1;

import java.util.Arrays;

/*Given an array of ints of even length, return a 
 * new array length 2 containing the middle two elements 
 * from the original array. The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 * */
public class makeMiddle {
	public static int[] makeMiddle(int[] nums) {
		  int mid=nums.length/2;
		  int  res[]={nums[mid-1],nums[mid]};
		  return res;
		}

	public static void main(String[] args) {
		int  arr1[]= {1,2,3,4};
		int  res[]=(makeMiddle(arr1));
		System.out.println(Arrays.toString(res));

	}

}
