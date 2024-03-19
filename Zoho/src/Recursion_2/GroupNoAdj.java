package Recursion_2;

public class GroupNoAdj {
	public boolean groupNoAdj(int start, int[] nums, int target) {
		  if(nums.length <= start) {
		    if(target == 0) 
		      return true;
		    else return false;
		  }
		  return groupNoAdj(start + 2, nums, target - nums[start]) 
		                    || groupNoAdj(start + 1, nums, target);
		}
}
