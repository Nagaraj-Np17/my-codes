package Array2;

public class isEverywhere {
	public boolean isEverywhere(int[] nums, int val) {
		  if(nums.length <= 1) return true;
		  boolean res=false;
		  for(int i=0; i<nums.length-1; i++) {
		    if(nums[i] == val || nums[i+1] == val) {
		      res=true;
		    }
		    else {
		      return false;
		    }
		  }
		  return (res);
		}
}
