package Array2;

public class sum67 {

	public static void main(String[] args) {
		
	}
	public int sum67(int[] nums) {
		  int  sum=0;
		  boolean add=true;boolean seven=false;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]==6) add=false;
		    if(nums[i]==7&& (!add))  {add=true;continue;}
		    if(add){
		      sum+=nums[i];
		    }
		  }
		  
		  return sum; 
		}


}
