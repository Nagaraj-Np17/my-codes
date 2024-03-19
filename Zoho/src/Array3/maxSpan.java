package Array3;
import java.util.Arrays;
/*Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 * */
public class maxSpan {
	public static int maxSpan(int[] nums) {
		 if(nums.length==1)return 1;
		  int sum=0;int len=0;
		  for(int i=0;i<nums.length-1;i++)
		  {
		    int j=nums.length-1;
		    while((i<j)&&nums[i]!=nums[j-i]){
		      j--;
		    }
		    len=Math.max(len,j-i+1);
		  }
		return len;
	}
	public static void main(String[] args) {
		int arr1[]= {1, 2, 1, 1, 3};
		int arr2[]= {1, 4, 2, 1, 4, 1, 4};
		int arr3[]= {1, 4, 2, 1, 4, 4, 4};
		System.out.println(maxSpan(arr1));
		System.out.println(maxSpan(arr2));
		System.out.println(maxSpan(arr3));
		
	}

}
