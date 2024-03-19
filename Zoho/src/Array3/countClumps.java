package Array3;
/*Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 * */
public class countClumps {
	public static int countClumps(int[] nums) {
		 int count=0;
			for(int i=0;i<nums.length-1;i++) {
				if(i>0&&(nums[i]==nums[i+1]&&nums[i]!=nums[i-1])) {
					count++;
				}else if((i==0)&&(nums[i]==nums[i+1])){
					count++;
				}
				
				}
				return count;
	
	}
	public static void main(String[] args) {
		int arr1[]= {1, 2, 2, 3, 4, 4};
		int arr2[]= {1, 1, 2, 1, 1};
		int arr3[]= {1, 1, 1, 1, 1};
		System.out.println(countClumps(arr1));
		System.out.println(countClumps(arr2));
		System.out.println(countClumps(arr3));
	}
}
