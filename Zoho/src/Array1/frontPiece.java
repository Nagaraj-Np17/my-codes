package Array1;
import java.util.Arrays;
/*Given an int array of any length, return a new array 
 * of its first 2 elements. If the array is smaller than length 2,
 *  use whatever elements are present.
frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
 * */
public class frontPiece {
	public static int[] frontPiece(int[] nums) {
		  if(nums.length<2)return nums;
		  int []res={nums[0],nums[1]};
		  return res;
		  
		}
	public static void main(String[] args) {
		int[] arr1= {1, 2, 3};
		int res[]= frontPiece(arr1);
		System.out.println(Arrays.toString(res));

	}

}
