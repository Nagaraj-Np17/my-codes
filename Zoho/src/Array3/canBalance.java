package Array3;
import java.util.Arrays;
/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 * */
public class canBalance {
	public static boolean canBalance(int[] nums) {
		int  sum=0;
		for(int i=0;i<nums.length-1;i++) {
			sum+=nums[i];int cursum=0;
			for(int j=i+1;j<nums.length;j++) {
				if(cursum>sum)break;
				cursum+=nums[j];
			}
			if(sum==cursum)return true;
		}
		return false;
		}
	public static void main(String[] args) {
		int  nums[]= {1,1,1,2,1};int  nums1[]= {2, 1, 1, 2, 1};
		int  nums2[]= {10,10};
		System.out.println(canBalance(nums));
		System.out.println(canBalance(nums1));
		System.out.println(canBalance(nums2));
	}
}
