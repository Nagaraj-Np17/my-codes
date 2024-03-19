package Array2;

public class has12 {
	public boolean has12(int[] nums) {
		  int ones=0;
		  for(int i=0;i<nums.length;i++){
		    if(ones>0){
		      if(nums[i]==2)return true;
		      continue;
		    }
		    if(nums[i]==1)ones=1;
		   
		   }
		    return false;
		    
		}
}
