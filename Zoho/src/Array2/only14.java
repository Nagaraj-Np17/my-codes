package Array2;

public class only14 {
	public boolean only14(int[] nums) {
		  for(int i=0;i<nums.length;i++){
		    if((nums[i]==1)||(nums[i]==4)){
		       continue;
		    }
		    return false;
		  }
		 return true;
		}

}
