	package Array2;

public class shiftLeft {
	public int[] shiftLeft(int[] nums) {
		  if(nums.length<=1)return nums;
		  int  start=nums[0];
		  int end=0;
		 while(end<nums.length-1){
		    nums[end]=nums[++end];
		  }
		  nums[end]=start;
		  return nums;
		}

}
