package Array2;

public class sameEnds {
	public boolean sameEnds(int[] nums, int len) {

		  boolean res=true;int end=nums.length-len;
		  for(int start=0;start<len;start++){
		    if(nums[start]==nums[end++]){
		      continue;
		    }else {
		      return false;
		    }
		  }
		  return true;
		  
		}

}
