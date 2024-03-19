package AP_1;

public class HasOne {
	public int[] copyEndy(int[] nums, int count) {
		  int res[]=new int [count];int  index=0;
		  for(int i=0;i<nums.length;i++){
		    if(index==count)break;
		    if(nums[i]>0&& nums[i]<=10  || nums[i]>=90 && nums[i]<=100){
		      res[index++]=nums[i];
		    }
		  }
		  return res;
		}

}
