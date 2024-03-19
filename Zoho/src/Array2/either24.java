package Array2;

public class either24 {
	public boolean either24(int[] nums) {
		  boolean twos=false,fours=false;
		  for(int i=0;i<nums.length-1;i++){
		    if(nums[i]==2 && nums[i+1]==2)twos=true;
		    if(nums[i]==4 && nums[i+1]==4) fours=true;
		  }
		  return ((twos==fours))?false:true;
		}

}
