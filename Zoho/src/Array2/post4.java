package Array2;

import java.util.Arrays;

public class post4 {
	public int[] post4(int[] nums) {
		  int lastFour=nums.length-1;
		  for(int  start=nums.length-1;start>=0;start--){
		    if(nums[start]==4){
		      lastFour=start;
		      break;
		    }
		    
		  }
		 
		 return Arrays.copyOfRange(nums,lastFour+1,nums.length) ;
	}		}