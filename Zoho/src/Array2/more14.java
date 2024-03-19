package Array2;

public class more14 {
	public boolean more14(int[] nums) {
		  int resCount=0;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]==1){
		      resCount++;
		    }else if(nums[i]==4){
		      resCount--;
		    }
		  }
		  return (resCount>0)?true:false;
		}

}
