package Array2;

import java.util.Arrays;

public class pre4 {
	public int[] pre4(int[] nums) {
		  int len= Arrays.binarySearch(nums, 4);
		  int[] array =  new int[len];
		  for(int i=0; i < len; i++) {
		    array[i] = nums[i];
		  }
		  return array;
		}
}
