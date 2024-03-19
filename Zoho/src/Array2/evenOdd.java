package Array2;

public class evenOdd {
	public int[] evenOdd(int[] nums) {
		  int start=0,end=nums.length-1;
		  int[] array = new int[nums.length];
		 for(int i=0;i<nums.length;i++){
		   if(nums[i]%2==0){
		   array[start++]=nums[i];
		   }else{
		     array[end--]=nums[i];;
		   }
		 }
		  return array;
		}
}
