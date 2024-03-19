package Array2;

public class has22 {

	public static void main(String[] args) {

	}
	public static boolean has22(int[] nums) {
		  
		  for(int i=0;i<nums.length-1;i++){
		    if(nums[i]==2&&nums[i+1]==2){
		      return true;    }
		 }		  
		  return false;
		  	  
		}


}
