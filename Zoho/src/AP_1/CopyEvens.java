package AP_1;

public class CopyEvens {
	public int[] copyEvens(int[] nums, int count) {
		  int  evenArray[]=new int[count];int  index=0;
		  for(int i=0;i<nums.length;i++){
		    if(index==count)break;
		    if(nums[i]%2==0 ){
		      evenArray[index++]=nums[i];
		    }
		  }
		  return evenArray;
		}

}
