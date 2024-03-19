package Array2;

public class tenRun {
	public int[] tenRun(int[] nums) {
		  int count=0;boolean in=false;
		  for(int  i=0;i<nums.length;i++){
		    if(in|| (nums[i]%10)==0){
		      in=true;
		      if(nums[i]%10==0){count=nums[i]/10;}
		        nums[i]=10*count;
		    }
		  }
		  return nums;
		}

}
