package Function_1;

import java.util.List;

public class Doubling {
	
	public List<Integer> doubling(List<Integer> nums) {
		 if(nums.size()==0)return nums;
		  nums.replaceAll(n -> n * 2);
		  return nums;
		}
}
