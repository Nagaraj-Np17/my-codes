package Array2;

public class zeroMax {
	public int[] zeroMax(int[] nums) {
		  int  currMax=0;
		  for(int i=nums.length-1;i>=0;i--){
		    if(nums[i]==0){
		        nums[i]=currMax;
		    }else if(nums[i]%2==1){
		   currMax=Math.max(nums[i],currMax);
		    }
		    
		  }return nums;
		}

}
