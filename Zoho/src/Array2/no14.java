package Array2;

public class no14 {
	public boolean no14(int[] nums) {
		  int  ones=0;int  fours=0;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]==1)ones=1;
		    else  if(nums[i]==4)fours=1;
		    if(ones==1&&fours==1){
		      return false;
		    }
		  }return true;
		}

	
}
