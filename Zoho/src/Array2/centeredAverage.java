package Array2;

import java.util.Arrays;

public class centeredAverage {
	public int centeredAverage(int[] nums) {
		  int  sum=0;
		  Arrays.sort(nums);
		  for(int i=1;i<nums.length-1;i++){
		    sum+=nums[i];
		  }
		  return (sum/(nums.length-2));
		  
		  
		}

}
