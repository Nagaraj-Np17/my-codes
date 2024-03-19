package Array2;

public class haveThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3, 1, 3, 1, 3};
		System.out.print(haveThree(a));
	}
	public static boolean haveThree(int[] nums) {
		  if(nums.length<2)return false;
		  int threes=0;
		  for(int i=0;i<nums.length;i++){ 
		    if((i+1<nums.length)&&nums[i]==3 && nums[i+1]!=3){
		      threes++;
		    }	    
		  }
		  if(nums[nums.length-1]==3 && nums[nums.length-2]!=3)threes++;
		  return(threes==3)?true:false;
		}


}
