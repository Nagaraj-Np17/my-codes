package Array2;

public class withoutTen {
	public int[] withoutTen(int[] nums) {
		  int res[]=new int[nums.length];int index=0;
		  for(int  i=0;i<nums.length;i++){
		    if(nums[i]!=10){
		      res[index++]=nums[i];
		    }
		  }
		  return res;
		}

}
