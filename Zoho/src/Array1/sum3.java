package Array1;
/*
Given an array of ints length 3, return the sum of all the elements.
sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
 * */
public class sum3 {
	public static int sum3(int[] nums) {
		  return nums[0]+nums[1]+nums[2];
		}

	public static void main(String[] args) {
		int  arr1[]= {1,2,3};
		int  arr2[]= {5, 11, 2};
		int  arr3[]= {7, 0, 0};
		System.out.println(sum3(arr1));
		System.out.println(sum3(arr2));
		System.out.println(sum3(arr3));
		
	}

}
